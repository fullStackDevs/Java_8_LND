package Lesson_14_Traversing_Collections_With_Method_References;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
		
	@Override
	public String toString() {
		return name + "(" + age + ")";
	}

	public static int compareAges(Person pers1, Person pers2){
		Integer agePers1 = pers1.getAge();
		return agePers1.compareTo(pers2.getAge());
	}

}
