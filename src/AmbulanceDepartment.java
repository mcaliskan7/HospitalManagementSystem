
public class AmbulanceDepartment extends EmergencyServices{
	
	public AmbulanceDepartment(String code) {
		super(code);
	}

	public void print() {
		System.out.println("Ambulance Department");
		super.print();
	}
	
	@Override
	public void getAppointment() {
		System.out.println("An ambulance is dispatched to the given address!");
	}
}
