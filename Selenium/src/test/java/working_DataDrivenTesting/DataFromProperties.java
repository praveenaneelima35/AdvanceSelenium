package working_DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataFromProperties {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/CommonData.properties");
		Properties p=new Properties();
		p.load(fis);
		String value1 = p.getProperty("url");
		

	}

}
