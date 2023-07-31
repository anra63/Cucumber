package com.training.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonUtilities {

	public String getproperty(String key) throws IOException {
		
		String path = "C:\\Users\\anura\\eclipse-workspace\\CucumberBasic\\src\\main\\resources\\properties\\application.properties";
		FileInputStream fileinput = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fileinput);
		String value = prop.getProperty(key);
		return value;
	}

}