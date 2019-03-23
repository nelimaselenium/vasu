package com.vasu.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Validation
{
@Test 
public void validation()
{
	String data1="Selenium";
	String data2="Selenium";
	
	Assert.assertEquals(data1, data2);
	
}
}
