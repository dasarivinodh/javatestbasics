package com.sample.basics.inheritance;

class A {
	void m1() {
		System.out.println("In m1 A");
	}
}

class B extends A {
	void m1() {
		super.m1();
		System.out.println("In m1 B");
	}

	void m2() {
		System.out.println("In m2 B");
	}
}

public class Inheritanceexample {

	public static void main(String[] args) {
		A a = new B();
		// a.m2(); // cannot call B object methods with a reference (Compile time error)
		a.m1(); // calls method in B
	}
}