package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleCheckBoxTest
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		WebElement table=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> checkBoxList=table.findElements(By.tagName("input"));
		System.out.println(checkBoxList.size());
		for (int i = 0; i < checkBoxList.size(); i++) 
		{
			//checkBoxList.get(i).click();
			//System.out.println(checkBoxList.get(i).getAttribute("checked")+"   "+checkBoxList.get(i).getAttribute("value"));
			/*if (checkBoxList.get(i).getAttribute("value").equals("Cheese"))
			{
				checkBoxList.get(i).click();
			}*/
			checkBoxList.get(i).click();
			for (int j = 0; j <checkBoxList.size(); j++)
			{
				System.out.println(checkBoxList.get(j).getAttribute("checked")+"-------"+checkBoxList.get(j).getAttribute("value"));	
			}
			System.out.println("#################");
		}
		
		

	}

}
