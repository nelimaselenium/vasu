package com.vasu.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingTest
{
@Test
public void read() throws Exception
{
	File srcFile=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
	
	FileInputStream fis=new FileInputStream(srcFile);
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet ws=wb.getSheet("Sheet1");
	int rcnt=ws.getLastRowNum();
	for (int i = 0; i <=rcnt; i++)
	{
		String data=ws.getRow(i).getCell(0).getStringCellValue();
		String data1=ws.getRow(i).getCell(1).getStringCellValue();
		System.out.println(data+"-----"+data1);	
	}
	String data=ws.getRow(0).getCell(0).getStringCellValue();
	String data1=ws.getRow(0).getCell(1).getStringCellValue();
	System.out.println(data+"-----"+data1);
}
}
