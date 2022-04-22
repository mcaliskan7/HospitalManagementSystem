import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class GUITest {
	
	public static ArrayList<Appointment> list = new ArrayList<>();

	public static void main(String[] args) {
		
		StringBuilder displayMenu = new StringBuilder();
		
		displayMenu.append("Welcome to the Hospital Management System!\n\n");
		for (Menu menu : Menu.values()) {
			displayMenu.append("\t\t\t" + menu.getExplanation() + "\n");
		}
		displayMenu.append("\nPlease Select an Action from the Menu: ");
		
		boolean terminate = false;
		
		while(!terminate) {
			try {
				String ch;
				int choice;
				
				ch = JOptionPane.showInputDialog(null, displayMenu, "Hospital Management System",
						JOptionPane.QUESTION_MESSAGE);
				
				choice = Integer.parseInt(ch);
				
				switch(choice) {
				    case 0: {
				    	terminate = true;
				    	break;
				    }
					case 1: {
						String name = JOptionPane.showInputDialog(null, "Please Enter Doctor's Name:",
								"Register a Doctor", JOptionPane.QUESTION_MESSAGE);
						String surname = JOptionPane.showInputDialog(null, "Please Enter Doctor's Surname:",
								"Register a Doctor", JOptionPane.QUESTION_MESSAGE);
						String field = JOptionPane.showInputDialog(null, "Please Enter Doctor's Field:",
								"Register a Doctor", JOptionPane.QUESTION_MESSAGE);
						
						list.add(new Doctor(name, surname, field));
						break;
					}
					case 2: {
						String name = JOptionPane.showInputDialog(null, "Please Enter Patient's Name:",
								"Register a Patient", JOptionPane.QUESTION_MESSAGE);
						String surname = JOptionPane.showInputDialog(null, "Please Enter Patient!s Surname:",
								"Register a Patient", JOptionPane.QUESTION_MESSAGE);
						String id = JOptionPane.showInputDialog(null, "Please Enter Patient's ID:",
								"Register a Patient", JOptionPane.QUESTION_MESSAGE);
						
						long ID = Long.parseLong(id);
						list.add(new Patient(name,surname,ID));
						break;
					}
					case 3: {
						Collections.sort(list, new MyComparator());
						Iterator<Appointment> itr = list.iterator();
						
						StringBuilder display = new StringBuilder();
						
						while (itr.hasNext()) {
							Appointment apt = itr.next();
							if (apt instanceof Doctor) {
								Doctor doctor = (Doctor) apt;
								display.append("Displaying Doctor:\n")
									   .append("Name: " + doctor.getName() + "\n")
									   .append("Surname: " + doctor.getSurname() + "\n")
									   .append("Field: " + doctor.getField() + "\n\n");
							}
						}
						
						JOptionPane.showMessageDialog(null, display);
						break;
					}
					case 4: {
						Collections.sort(list, new MyComparator());
						Iterator<Appointment> itr = list.iterator();
						
						StringBuilder display = new StringBuilder();
						
						while (itr.hasNext()) {
							Appointment apt = itr.next();
							if (apt instanceof Patient) {
								Patient patient = (Patient) apt;
								display.append("Displaying Patient:\n")
									   .append("Name: " + patient.getName() + "\n")
									   .append("Surname: " + patient.getSurname() + "\n")
									   .append("ID: " + patient.getID() + "\n\n");
							}
						}
						
						JOptionPane.showMessageDialog(null, display);
						break;
					}
					case 5: {
						String code = JOptionPane.showInputDialog(null, "Please Enter Ambulance Department's Code: ",
								"Register an Ambulance Department", JOptionPane.QUESTION_MESSAGE);
						
						list.add(new AmbulanceDepartment(code));
						break;
					}
					case 6: {
						String code = JOptionPane.showInputDialog(null, "Please Enter Fire Department's Code: ",
								"Register an Fire Department", JOptionPane.QUESTION_MESSAGE);
						
						list.add(new FireDepartment(code));
						break;
					}
					case 7: {
						Collections.sort(list, new MyComparator());
						Iterator<Appointment> itr = list.iterator();
						
						StringBuilder display = new StringBuilder();
						
						while (itr.hasNext()) {
							Appointment apt = itr.next();
							
							if (apt instanceof AmbulanceDepartment) {
								AmbulanceDepartment ambDep = (AmbulanceDepartment) apt;
								display.append("Displaying Ambulance Department:\n")
									   .append("Code: " + ambDep.getCode() + "\n\n");
							}
						}
						
						JOptionPane.showMessageDialog(null, display);
						break;
					}
					case 8: {
						Collections.sort(list, new MyComparator());
						Iterator<Appointment> itr = list.iterator();
						
						StringBuilder display = new StringBuilder();
						
						while (itr.hasNext()) {
							Appointment apt = itr.next();
							
							if (apt instanceof FireDepartment) {
								FireDepartment fireDep = (FireDepartment) apt;
								display.append("Displaying Fire Department:\n")
									   .append("Code: " + fireDep.getCode() + "\n\n");
							}
						}
						
						JOptionPane.showMessageDialog(null, display);
						break;
					}
					case 9: {
						//to be implemented
					}
					default: {
						JOptionPane.showMessageDialog(null,
								"Invalid choice! Please try again. (0-9)\n", "Invalid Menu Choice", JOptionPane.ERROR_MESSAGE);
						break;
					}
				}
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null,
						"Please enter a valid choice!", "Invalid Menu Choice", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
