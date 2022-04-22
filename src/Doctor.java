
public class Doctor extends Person {
	private String field;
	private static int doctorCount = 0;
	
	public Doctor(String name, String surname, String field) {
		super(name, surname);
		this.field = field;
		doctorCount++;
	}
	
	public String getField() {
		return field;
	}

	public void displayInfo() {
		System.out.println("Displaying Doctor: \n");
		super.displayInfo();
		System.out.println("Field: " + field + "\n");
	}
	
	public static int getCount() {
		return doctorCount;
	}
	
	@Override
	public void getAppointment() {
		System.out.println("Doctor " + getName() + " makes and appointment with its supperior.");
	}
}
