package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ChainActionsTest {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.ceoandhra.nic.in/");
		driver.manage().window().maximize();
		
		WebElement reg=driver.findElement(By.xpath("//*[@id='myjquerymenu']/ul/li[5]/a"));
		WebElement asm=driver.findElement(By.xpath("//*[@id='myjquerymenu']/ul/li[5]/ul/li[1]/a"));
		WebElement kys=driver.findElement(By.xpath("//*[@id='myjquerymenu']/ul/li[5]/ul/li[1]/ul/li[7]/a"));
		
		Actions chain=new Actions(driver);
		
		chain.moveToElement(reg).moveToElement(asm).pause(2000).moveToElement(kys).click().build().perform();
		

	}

}
