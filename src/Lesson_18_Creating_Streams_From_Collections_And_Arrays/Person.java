package Lesson_18_Creating_Streams_From_Collections_And_Arrays;

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
	
	public void display(){
		System.out.println(name + "(" + age + ")");
	}
}
