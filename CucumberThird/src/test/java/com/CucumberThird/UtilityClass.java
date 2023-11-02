package com.CucumberThird;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {
	String url;
	String username;
	String password;
	
	public UtilityClass(){
		data();
	}
	
	public void data() {
		File file = new File("C:\\Users\\dmulinti\\eclipse-workspace\\CucumberThird\\src\\test\\resources\\data.properties");
		
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		try {
			prop.load(fileInput);
		}catch(IOException e){
			e.printStackTrace();
		}
		url = prop.getProperty("url");
		username = prop.getProperty("username");
	    password = prop.getProperty("password");
	}
}
