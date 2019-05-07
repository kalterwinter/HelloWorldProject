package test;

import data.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		String personText;
		//
		Person p1; // Variablen Definition
		p1 = new Person(); // Instanzierung
		//
		p1.setVorname("Hans");
		p1.setNachname("Huber");
		p1.setStrasse("Promenadenweg");
		p1.setHausnummer("4");
		p1.setPlz("1230");
		p1.setOrt("Wien");
		//
		System.out.println(p1);
	}

}
