package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinksTest 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.quikr.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//a[@id='searchedCat']")).click();
		
		
		List<WebElement> headerLinks=driver.findElements(By.xpath(".//*[@id='category-dropdown']/ul/li/a"));
		System.out.println(headerLinks.size());
		
		
		
		

	}

}
