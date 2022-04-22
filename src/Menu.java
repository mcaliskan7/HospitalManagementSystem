
public enum Menu {
	M1("(1) Register a New Doctor"),
	M2("(2) Register a New Patient"),
	M3("(3) Display All Doctors"),
	M4("(4) Display All Patients"),
	M5("(5) Register an Ambulance Department"),
	M6("(6) Register a Fire Department"),
	M7("(7) Display All Ambulance Departments"),
	M8("(8) Display All Fire Deartments"),
	M9("(9) Make an Appointment"),
	M0("(0) Exit");
	
	private String exp;
	
	private Menu(String exp) {
		this.exp = exp;
	}
	
	public String getExplanation() {
		return exp;
	}
	
	public static void displayMenu() {
		System.out.println("\n\t\t\tWelcome to the Hospital Management System!"
				+ "\n\t\t\t******************************************\n");
		
		for (Menu menu : Menu.values()) {
			System.out.println("\t\t\t" + menu.getExplanation());
		}
	}
}