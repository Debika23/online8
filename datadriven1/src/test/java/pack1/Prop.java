package pack1;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

public class Prop {

	@Test
	public void test() throws Exception {
		//read data from property file
		
		File f=new File("C:\\Users\\admin\\online\\7-8\\datadriven1\\src\\main\\resources\\config\\global.properties");
		Properties prop1=new Properties();
		prop1.load(new FileInputStream(f));
		System.out.println(prop1.getProperty("browser"));
		
	}

}
