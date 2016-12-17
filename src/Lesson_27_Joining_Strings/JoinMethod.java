package Lesson_27_Joining_Strings;

public class JoinMethod {

	public static void main(String[] args) {
		
		String names = String.join(",", "Helen", "Marian", "Cristina");
		System.out.println(names);
		
		String[] states = {"Arizona", "Miamy", "Maine"};
		
		String stateList = String.join(" and ", states);
		System.out.println(stateList);
	}

}
