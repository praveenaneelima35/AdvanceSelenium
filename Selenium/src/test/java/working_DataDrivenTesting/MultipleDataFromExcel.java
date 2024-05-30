package working_DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\satis\\Desktop\\Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet3");
		
		int lastRowNum=sh.getPhysicalNumberOfRows();
		System.out.println("The last Row number is "+lastRowNum);
		int lastCellNum=sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println("The last Cell number is "+lastCellNum);

		for(int i=0; i<lastRowNum; i++) {
			for(int j=0; j<lastCellNum; j++) {
				System.out.print(sh.getRow(i).getCell(j).toString() + " ");
			}
			System.out.println();
		}
	}

}
