package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodsTest {

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("Http://Amazon.in");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		Select  sl=new Select(drop);
		sl.selectByIndex(23);
		//sl.selectByVisibleText("Books");
		//sl.selectByValue("search-alias=software");
		/*List<WebElement> dropList=sl.getOptions();
		System.out.println(dropList.size());
		for (int i = 0; i < dropList.size(); i++) 
		{
			System.out.println(dropList.get(i).getText());
		}*/
		//System.out.println(sl.isMultiple());
		//System.out.println(sl.getFirstSelectedOption().getText());
		/*List<WebElement> list=sl.getAllSelectedOptions();
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i).getText());
		}*/
		Thread.sleep(2000);
		sl.deselectByIndex(23);
		

	}

}
