package pack1;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Xls {

	@Test
	public void test() throws Exception {
		
		//read data from .xls using poi
		File f=new File("C:\\Users\\admin\\online\\7-8\\datadriven1\\testdata\\Book11.xls");
		//file--workbook--sheet--row--cell--celldata
		FileInputStream fis=new FileInputStream(f);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet s=wb.getSheetAt(0);
		HSSFRow r=s.getRow(10);
		HSSFCell c=r.getCell(1);
		System.out.println(c.getStringCellValue());
		
		
	}

}
