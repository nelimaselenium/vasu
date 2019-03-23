package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BranchCreation extends PrimusBank
{
@Test
public void branchCreation() throws Exception
{
	driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	driver.findElement(By.id("BtnNewBR")).click();
	driver.findElement(By.id("txtbName")).sendKeys("VasuSelenium324");
	driver.findElement(By.id("txtAdd1")).sendKeys("Ameerpet");
	driver.findElement(By.id("txtZip")).sendKeys("55555");
	
	Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
	country.selectByIndex(1);
	Thread.sleep(2000);
	Select state=new Select(driver.findElement(By.id("lst_stateI")));
	state.selectByIndex(1);
	Thread.sleep(2000);
	Select city=new Select(driver.findElement(By.id("lst_cityI")));
	city.selectByIndex(1);
	Thread.sleep(2000);
	driver.findElement(By.id("btn_insert")).click();
	Thread.sleep(40000);
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
	
}
}
