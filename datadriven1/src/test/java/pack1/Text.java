package pack1;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Text {

	@Test
	public void test() throws Exception {
		//read data from text file
		
		File f=new File("C:\\Users\\admin\\online\\7-8\\datadriven1\\testdata\\text.txt");
		String str=FileUtils.readFileToString(f);
		System.out.println(str);
		
		//write data
		File f1=new File("C:\\Users\\admin\\online\\7-8\\datadriven1\\testdata\\text.txt");
		FileUtils.writeStringToFile(f1, "Testing Tools");
		
		
	}

}
