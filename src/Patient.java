import java.util.Scanner;

public class Patient extends Person {	
	private long ID;	
	private static int patientCount = 0;
	
	public Patient(String name, String surname) {
		this(name, surname, 11111);
	}

	public Patient(String name, String surname, long ID) {
		super(name, surname);
		this.ID = ID;
		patientCount++;
	}
	
	public void displayInfo() {
		System.out.println("Displaying Patient: \n");
		super.displayInfo();
		System.out.println("ID: " + ID + "\n");
	}
	
	public static int getCount() {
		return patientCount;
	}
	
	public long getID() {
		return ID;
	}
	
	public void getAppointment() {
		System.out.println("Making an appointment for patient " + getName() + "...");
		System.out.println("Please enter a doctor name: ");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		for (Appointment a : HMSTest.list) {
			if (a instanceof Doctor) {
				Doctor d = (Doctor) a;
				if (d.getName().equals(tmp)) {
					System.out.println("Patient " + getName() + " makes an appointment"
							+ " with doctor " + d.getName() + ".");
					return;
				}
			}
		}
		System.out.println("No such doctor name!");
	}
}
