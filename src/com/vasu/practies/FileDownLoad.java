package com.vasu.practies;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownLoad {

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='mainContent']/p[3]/a")).click();
		//AutoIt
		Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\filedownload.exe");
	}

}
