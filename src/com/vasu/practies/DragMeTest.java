package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DragMeTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
		/*List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());*/
		WebElement frame1=driver.findElement(By.xpath(".//*[@id='content']/iframe"));
		driver.switchTo().frame(frame1);
		
		WebElement drg=driver.findElement(By.xpath(".//*[@id='draggable']"));
		System.out.println(drg.getText());
		driver.switchTo().defaultContent();
		WebElement heading=driver.findElement(By.xpath(".//*[@id='content']/h1"));
		System.out.println(heading.getText());

	}

}
