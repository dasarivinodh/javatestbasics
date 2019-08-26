package com.sample.basics.inheritance;
interface BaseI{
    void method();
}
class BaseC
{
	public void method()
	{
		System.out.println("In Base C");
	}
}

public class Inheritance2 extends BaseC implements BaseI{
 
	public static void main(String[] args) {
		(new Inheritance2()).method();
	}
}