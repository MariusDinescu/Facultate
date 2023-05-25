import java.util.ArrayList;
import java.util.List;

public class TestFacultate {

	public static void main(String[] args) {
		
		
		
		
		Facultate facultate = new Facultate("UNITBV", "unitbv@gmail.com");
		
		
		facultate.addStudent(new Student("Andrei", "Cosmin", "principala", "andre1i2@gmail.com", "FSA2D", 1, "IE", 9.50));
		facultate.addStudent(new Student("Andrei", "Cosmin", "principala", "andre1i2@gmail.com", "FSA2D", 1, "IE", 9.50));
		facultate.addStudent(new Student("Bucur", "Andrei", "secundara", "bucur123@gmail.com", "DCD@", 2, "IE", 7.50));

		facultate.addCadruDidactic(new CadruDidactic("Vasile", "Ion", "Sperantei", "vasile123@gmail.com", 2000, 5, "Asistent"));
		facultate.addCadruDidactic(new CadruDidactic("Jamil", "Radu", "Strada secundara", "radu12123@gmail.com", 2500, 3, "Asistent"));

//		facultate.removeAngajat();
//		facultate.removeStudent();
//		
		
		ArrayList<Persoana> cadre_didactice = new ArrayList<>(facultate.getAngajati());
		ArrayList<Persoana> studenti = new ArrayList<>(facultate.getStudenti());
		
		facultate.afisare(studenti);
		System.out.println("---------");
		facultate.afisare(cadre_didactice);
		
		facultate.adaugareNota();
		facultate.adaugareNota();
		
		facultate.afisareNote();
		
		
		
	}

}
