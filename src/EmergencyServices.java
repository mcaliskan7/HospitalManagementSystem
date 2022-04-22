
public abstract class EmergencyServices implements Appointment {
	private String code;

	public EmergencyServices(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void print() {
		System.out.println("Service Name: " + code + "\n");
	}
}
