package com.vasu.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WritingTest 
{
	@Test
	public void write() throws Exception
	{
		File srcFile=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("Sheet1");
		ws.getRow(1).createCell(2).setCellValue("Nileema");
		ws.getRow(2).createCell(2).setCellValue("Sirisha");
		
		FileOutputStream fos=new FileOutputStream(srcFile);
		wb.write(fos);
		wb.close();
	}
}
