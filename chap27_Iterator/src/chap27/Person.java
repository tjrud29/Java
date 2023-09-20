package chap27;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person otherPerson) {
		
		return this.age - otherPerson.age;
	}
	
	@Override
	public String toString() {
		return "Person{name=" + name + ", age " + age;
	}

}
