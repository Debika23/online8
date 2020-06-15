package pack1;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel {

	@Test
	public void test() throws Exception {
		
		//read data from .xls using jxl
		File f=new File("C:\\Users\\admin\\online\\7-8\\datadriven1\\testdata\\Book11.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet(0);
		String str=s.getCell(2, 4).getContents();
		System.out.println(str);
		
		
	}

}
