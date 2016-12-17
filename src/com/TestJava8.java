package com;

public class TestJava8 {

	public static void main(String[] args){
		
		//An instance of a functional interface using a lamda expression
		TestInterface tester = () -> System.out.println("JavaSE 8 is working!");
		tester.test();
		
	}
}
