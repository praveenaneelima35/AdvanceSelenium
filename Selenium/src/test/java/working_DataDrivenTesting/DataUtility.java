package working_DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {

	public String getDataFromProperties(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/CommonData.properties");
		Properties p=new Properties();
		p.load(fis);
	    String value = p.getProperty(key);
	    return value;	   
	}
	public String getDataFromExcel(String SheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\satis\\Desktop\\Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(SheetName);
		String value=sh.getRow(row).getCell(cell).toString();
		return value;
	}
}
