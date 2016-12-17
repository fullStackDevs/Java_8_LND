package Lesson_15_Implem_Default_Methods_In_Interfaces;

public interface PersonInterf {

	String getName();
	void setName(String name);
	int getAge();
	void setAge(int age);
	
	default String getPersonInfo(){
		return getName() + "(" + getAge() + ")";
	}
}
