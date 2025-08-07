package DataDrivernHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//convert physical file to java object
		FileInputStream fis=new FileInputStream("/BasicSelenium1/src/test/resources/data.properties");
		//create an object of property file
		Properties p=new Properties();
		//load property object
		p.load(fis);
		//fetch the data from property object
		String data = p.getProperty("browser");
		
		System.out.println(data);
		
	}

}
