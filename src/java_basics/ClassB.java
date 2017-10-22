package java_basics;

import webdriverexamples.Exception;

public class ClassB extends ClassA
{
	public void div(int x,int y)
	{
		int z= x/y;
		System.out.println(z);
	}
	public static void main(String[] args)
	{
	//ClassA obj= new ClassA();
	//obj.add(15, 65);
	//obj.sub(25, 5);
	
		ClassB obj= new ClassB();
		obj.add(10, 20);
		obj.div(10, 20);
		obj.sub(10, 20);
	
	}

}
