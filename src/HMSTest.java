import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;

public class HMSTest {
	
	public static ArrayList<Appointment> list = new ArrayList<>();

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean terminate = false;
		
		while (!terminate) {			
			int choice = 0;
			
			Menu.displayMenu();
			
			try {
				System.out.println("\nPlease Select an Action from the Menu: ");
				choice = scanner.nextInt();
				scanner.nextLine();
				
				switch(choice) {
					case 1: {
						System.out.print("Please Enter Doctor's Name: ");
						String name = scanner.nextLine();
						System.out.print("Please Enter Doctor's Surname: ");
						String surname = scanner.nextLine();
						System.out.print("Please enter Doctor's Field: ");
						String field = scanner.nextLine();
						
						list.add(new Doctor(name, surname, field));
						break;
					}
					case 2: {
						System.out.print("Please Enter Patient's Name: ");
						String name = scanner.nextLine();
						System.out.print("Please Enter Patient's Surname: ");
						String surname = scanner.nextLine();
						System.out.print("Please enter Patient's ID: ");
						long ID = scanner.nextLong();
						
						list.add(new Patient(name, surname, ID));
						break;
					}
					case 3: {
						Collections.sort(list, new MyComparator());
						System.out.println("Sorting done.\n");
						
						Iterator<Appointment> itr = list.iterator();
						
						while (itr.hasNext()) {
							Appointment apt = itr.next();
							if (apt instanceof Doctor) {
								((Doctor) apt).displayInfo();
							}
						}
						
						break;
					}
					case 4: {
						Iterator<Appointment> itr = list.iterator();
							
						while (itr.hasNext()) {
							Appointment apt = itr.next();
							if (apt instanceof Patient) {
								((Patient) apt).displayInfo();
							}
						}
						
						break;
					}
					case 5: {
						System.out.print("Please enter a code: ");
						String code = scanner.nextLine();
						
						list.add(new AmbulanceDepartment(code));
						break;
					}
					case 6: {
						System.out.print("Please enter a code: ");
						String code = scanner.nextLine();
						
						list.add(new FireDepartment(code));
						break;
					}
					case 7: {
						Iterator<Appointment> itr = list.iterator();
						
						while (itr.hasNext()) {
							Appointment apt = itr.next();
							if (apt instanceof AmbulanceDepartment) {
								((AmbulanceDepartment) apt).print();
							}
						}
						
						break;
					}
					case 8: {
						Iterator<Appointment> itr = list.iterator();
						
						while (itr.hasNext()) {
							Appointment apt = itr.next();
							if (apt instanceof FireDepartment) {
								((FireDepartment) apt).print();
							}
						}
						
						break;
					}
					case 9: {
						Iterator<Appointment> itr = list.iterator();
						
						while (itr.hasNext()) {
							Appointment a = itr.next();
							a.getAppointment();
							System.out.println();
							System.out.println("-----");
							System.out.println();
						}
						
						break;
					}
					case 0: {
						terminate = true;
						break;
					}
					default: {
						System.out.println("Invalid choice! Please try again. (0-9)\n");
						break;
					}
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please enter a valid choice!");
				scanner.next();
			}
		}
		
		scanner.close();
	}
}
