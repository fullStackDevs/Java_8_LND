package Lesson_10_Functional_Interfaces;

import Lesson_10_Functional_Interfaces.interfaces.InterfaceWithArgs;

public class UseInterfaceWithArgs {

	public static void main(String[] args) {
		
		InterfaceWithArgs myObject = (val1, val2) -> 
		{
			int result = val1 + val2;
			System.out.println("The result is: " + result);
		};
		
		myObject.calculate(50, 10);

	}

}
