
public abstract class Person implements Appointment {
	String name;
	String surname;
	
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Surname: " + surname);
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
}
