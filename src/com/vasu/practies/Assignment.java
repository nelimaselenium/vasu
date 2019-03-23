package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://amazon.in");
		driver.manage().window().maximize();
		//identify the header section and store into webelement
		WebElement header=driver.findElement(By.id("nav-xshop"));
		List<WebElement> headerLinks=header.findElements(By.tagName("a"));
		System.out.println(headerLinks.size());
		for (WebElement element : headerLinks) 
		{
			System.out.println(element.getText());
		}
	}

}
