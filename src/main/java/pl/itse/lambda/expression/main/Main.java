package pl.itse.lambda.expression.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
* Simple example how to use lambda expression in stream
* 
* @author Borys Pawluczuk
*/

public class Main {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person(10));
		persons.add(new Person(5));
		persons.add(new Person(18));
		persons.add(new Person(22));
		persons.add(new Person(3));
		persons.add(new Person(42));

		for (Person filterPersons : persons.stream().filter(p -> p.getAge() >= 18).collect(Collectors.toList())) {

			System.out.println("Persons who are above 18 years old: " + filterPersons.getAge());
		}
		
		for (Person filterPersons : persons.stream().filter(p -> p.getAge() < 18).collect(Collectors.toList())) {

			System.out.println("Persons who are below 18 years old: " + filterPersons.getAge());
		}

	}

}
