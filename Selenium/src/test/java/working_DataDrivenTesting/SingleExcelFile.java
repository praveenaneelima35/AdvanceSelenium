package working_DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SingleExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\satis\\Desktop\\Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row rw=sh.getRow(0);
		Cell cl=rw.getCell(0);
          //String value1 = cl.getStringCellValue();
          String value1 = cl.toString();
          System.out.println(value1);
          //double value2=sh.getRow(1).getCell(0).getNumericCellValue();
          String value2=sh.getRow(1).getCell(0).toString();
          System.out.println(value2);
	}

}
