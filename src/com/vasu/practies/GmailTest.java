package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest
{

	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("Http://Amazon.in");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("VasuDeva");
		
		
	}

}
