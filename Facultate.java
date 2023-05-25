import java.util.ArrayList;
import java.util.Scanner;

public class Facultate {

	protected String denumire;
	protected String contact;
	protected ArrayList<Specializare> specializari = new ArrayList<>();
	protected ArrayList<Angajat> angajati = new ArrayList<>();
	protected ArrayList<Student> studenti = new ArrayList<>();

	public Facultate(String denumire, String contact, ArrayList<Specializare> specializari, ArrayList<Angajat> angajati,
			ArrayList<Student> studenti) {
		super();
		this.denumire = denumire;
		this.contact = contact;
		this.specializari = specializari;
		this.angajati = angajati;
		this.studenti = studenti;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public ArrayList<Specializare> getSpecializari() {
		return specializari;
	}

	public void setSpecializari(ArrayList<Specializare> specializari) {
		this.specializari = specializari;
	}

	public ArrayList<Angajat> getAngajati() {
		return angajati;
	}

	public void setAngajati(ArrayList<Angajat> angajati) {
		this.angajati = angajati;
	}

	public ArrayList<Student> getStudenti() {
		return studenti;
	}

	public void setStudenti(ArrayList<Student> studenti) {
		this.studenti = studenti;
	}

	public Facultate(String denumire, String contact) {
		super();
		this.denumire = denumire;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Facultate [denumire=" + denumire + ", contact=" + contact + ", specializari=" + specializari
				+ ", angajati=" + angajati + ", studenti=" + studenti + "]";
	}

	public void addStudent(Student adding) {

		for (Student student : studenti) {
			if (student.getNrMatricol().compareToIgnoreCase(adding.getNrMatricol()) == 0) {
				System.out.println("Studentul exista deja!");
				return;
			}
		}

		studenti.add(adding);

	}

	public void addCadruDidactic(CadruDidactic adding) {

		for (Angajat angajat : angajati) {
			if (angajat.getEmail().compareToIgnoreCase(adding.getEmail()) == 0) {
				System.out.println("Studentul exista deja!");
				return;
			}
		}

		angajati.add(adding);
	}

	public void afisare(ArrayList<Persoana> persoane) {

		for (Persoana p : persoane) {
			System.out.println(p);
		}

	}

	public void removeAngajat() {
		Scanner sc = new Scanner(System.in);
		String nume = sc.nextLine();
		String prenume = sc.nextLine();

		for (Angajat a : angajati) {
			if (a.getNume().equalsIgnoreCase(nume) && a.getPrenume().equalsIgnoreCase(prenume)) {
				angajati.remove(a);
			}else {
				System.out.println("Nu exista in facultate acest angajat!");
			}
		}
	}
	
	public void removeStudent() {
		Scanner sc = new Scanner(System.in);
		String nume = sc.nextLine();
		String prenume = sc.nextLine();

		for (Student a : studenti) {
			if (a.getNume().equalsIgnoreCase(nume) && a.getPrenume().equalsIgnoreCase(prenume)) {
				studenti.remove(a);
			}else {
				System.out.println("Nu exista in facultate acest student!");
			}
		}
		sc.close();
	}
	
	public void adaugareNota() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti id-ul cursului: ");
		int id = sc.nextInt();
		System.out.println("Introduceti numele studentului: ");
		String nume = sc.next();
		System.out.println("Introduceti prenumele studentului: ");
		String prenume = sc.next();
		System.out.println("Introduceti nota: ");
		double nota = sc.nextDouble();
		
		NotaCurs notaCurs = new NotaCurs(id, nota);
		for(Student s:studenti) {
			if(s.getNume().equalsIgnoreCase(nume) && s.getPrenume().equalsIgnoreCase(prenume)) {
				s.adaugareNota(notaCurs);
			}
		}
		
		
	}
	
	public void afisareNote() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti numele studentului: ");
		String nume1 = sc.nextLine();
		System.out.println("Introduceti prenumele studentului: ");
		String prenume1 = sc.nextLine();
		for(Student s:studenti) {
			if(s.getNume().equalsIgnoreCase(nume1) && s.getPrenume().equalsIgnoreCase(prenume1)) {
				s.afisareNote();
			}
		}
	}
	
	
}
