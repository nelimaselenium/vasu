package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		WebElement check=driver.findElement(By.id("remember"));
		//check.click();
		System.out.println(check.getAttribute("checked"));
		//validate
		if (check.isSelected())
		{
			check.click();
			System.out.println(check.getAttribute("checked"));
		}
		

	}

}
