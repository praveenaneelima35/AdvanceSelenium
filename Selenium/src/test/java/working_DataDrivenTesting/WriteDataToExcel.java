package working_DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("C:\\Users\\satis\\Desktop\\Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		//Create a sheet
		Sheet sh=wb.createSheet("Result");
		//Create a Row and Cell
        sh.createRow(0).createCell(0).setCellValue("Selenium Batch");
        
        FileOutputStream fos=new FileOutputStream("C:\\Users\\satis\\Desktop\\Book1.xlsx");
        //Write a value to the Excel
        wb.write(fos);
        //Compulsory Method
        fos.flush();
        System.out.println("---Done---");
	}

}
