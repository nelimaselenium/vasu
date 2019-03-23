package com.vasu.java;

public class Vasu 
{
//variable
	int i=10;
	//method
	public void add()
	{
		int a=20;
		int b=40;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		//object
		Vasu v=new Vasu();
		v.add();
		System.out.println(v.i);
	}
}
