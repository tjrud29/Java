package chap28_comparable;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
	private String name;
	private int age;
	
	
	public PersonMain(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(PersonMain otherPerson) {
		
		return this.age - otherPerson.age;
	}
	
	@Override
	public String toString() {
		return "PersonMain{name=" + name + ", age " + age;
	}

	public static void main(String[] args) {
		List<PersonMain> people = new ArrayList<>();
		people.add(new PersonMain("학생1",78));
		people.add(new PersonMain("학생2",60));
		
		//나이를 기준으로 정렬
		//Collections.short(people);
		
		for(PersonMain person : people) {
			System.out.println(person);
		}
		
		
	}

}
