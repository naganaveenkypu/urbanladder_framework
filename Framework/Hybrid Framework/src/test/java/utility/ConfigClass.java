package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigClass {
	Properties pro;

	public ConfigClass() throws FileNotFoundException {
		File src = new File("./Config/config.properties");
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
// TODO Auto-generated catch block
			System.out.println("not able to load config file" + e.getMessage());
		}
	}

	public String getDataFromconfig(String keyTosearch) {
		return pro.getProperty(keyTosearch);
	}

	public String getBrowser() {
		return pro.getProperty("Browser");
	}

	public String getStagingurl() {
		return pro.getProperty("URL");
	}
}
