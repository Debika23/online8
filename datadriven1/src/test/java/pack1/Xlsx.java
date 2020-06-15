package pack1;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Xlsx {

	@Test
	public void test() throws Exception {
		
		//read data from .xlsx using poi
		File f=new File("C:\\Users\\admin\\online\\7-8\\datadriven1\\testdata\\Book1.xlsx");
		//file--workbook--sheet--row--cell--celldata
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		XSSFRow r=s.getRow(5);
		XSSFCell c=r.getCell(1);
		System.out.println(c.getStringCellValue());
		
		
		
	}

}
