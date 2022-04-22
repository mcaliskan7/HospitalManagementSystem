
public class FireDepartment extends EmergencyServices{
	
	public FireDepartment(String code) {
		super(code);
	}

	public void print() {
		System.out.println("Fire Department");
		super.print();
	}
	
	@Override
	public void getAppointment() {
		System.out.println("Fire truck and firefighters are dispatched to the given address!");
	}
}
