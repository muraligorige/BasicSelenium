package DataDrivernHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class WriteBackDataToPropertyFile {

	public static void main(String[] args) throws IOException {
		//convert physical file to java object
				FileInputStream fis=new FileInputStream("./data.properties");
				//create an object of property file
				Properties p=new Properties();
				//load property object
				p.load(fis);
				//write the datA TO PROP OBJ'
				p.put("subject","selenium");
				
				
				FileOutputStream fos=new FileOutputStream("./data.properties");
				//save the property file
				p.store(fos, "updateed subject");
				
	}

}

