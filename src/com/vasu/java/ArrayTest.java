package com.vasu.java;

public class ArrayTest {

	public static void main(String[] args) 
	{
		//datatype [] arrayName=new datatype[size];
		int [] a=new int[5];
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		//insert
		a[0]=11;
		a[1]=12;
		a[2]=13;
		a[3]=14;
		a[4]=15;
		a[5]=16;
		System.out.println("##########");
		/*for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}*/
		for(int x:a)
		{
			System.out.println(x);
		}
	}

}
