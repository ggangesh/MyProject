package com.gangesh.firstProject;

public class Demo1 {

	public void m1() {
	    System.out.println("this is m1 method");
	}
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.m1();
		Demo2 d2 = new Demo2();
		d2.display();
	}

}
