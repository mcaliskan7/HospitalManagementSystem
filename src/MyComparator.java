import java.util.Comparator;

public class MyComparator implements Comparator<Appointment> {
	
	public int compare(Appointment apt1, Appointment apt2) {
		if (apt1 instanceof Doctor && apt2 instanceof Doctor) {
			Doctor doc1 = (Doctor) apt1;
			Doctor doc2 = (Doctor) apt2;
			
			if(doc1.surname.compareTo(doc2.surname) != 0)
				return doc1.surname.compareTo(doc2.surname);
			
			return doc1.name.compareTo(doc2.name);
		}
		else
			return 0;
	}
}
