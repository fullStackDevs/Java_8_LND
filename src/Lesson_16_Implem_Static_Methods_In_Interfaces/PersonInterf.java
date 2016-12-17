package Lesson_16_Implem_Static_Methods_In_Interfaces;

public interface PersonInterf {
	
	void setName(String name);
	String getName();
	void setAge(int age);
	int getAge();
	
	public static String getPersonalInfo(Person pers){
		return pers.getName() + "(" + pers.getAge() + ")";
	}

}
