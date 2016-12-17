package Lesson_10_Functional_Interfaces;

import Lesson_10_Functional_Interfaces.interfaces.SimpleInterface;

public class UseSimpleInterface {

	public static void main(String[] args) {
		SimpleInterface mySimpleInterf = () -> System.out.println("This is the implementation for the doSometing method");
		mySimpleInterf.doSomething();
	}

}
