import java.util.ArrayList;

public class Student extends Persoana {

	protected String NrMatricol;
	protected int an_de_studiu;
	protected String specializare;
	protected double medieAdmitere;
	protected ArrayList<NotaCurs> note = new ArrayList<>();
	
	public Student(String nume, String prenume, String adresa, String email, String nrMatricol, int an_de_studiu,
			String specializare, double medieAdmitere) {
		super(nume, prenume, adresa, email);
		NrMatricol = nrMatricol;
		this.an_de_studiu = an_de_studiu;
		this.specializare = specializare;
		this.medieAdmitere = medieAdmitere;
	}

	public String getNrMatricol() {
		return NrMatricol;
	}

	public void setNrMatricol(String nrMatricol) {
		NrMatricol = nrMatricol;
	}

	public int getAn_de_studiu() {
		return an_de_studiu;
	}

	public void setAn_de_studiu(int an_de_studiu) {
		this.an_de_studiu = an_de_studiu;
	}

	public String getSpecializare() {
		return specializare;
	}

	public void setSpecializare(String specializare) {
		this.specializare = specializare;
	}

	public double getMedieAdmitere() {
		return medieAdmitere;
	}

	public void setMedieAdmitere(double medieAdmitere) {
		this.medieAdmitere = medieAdmitere;
	}

	public ArrayList<NotaCurs> getNote() {
		return note;
	}

	public void setNote(ArrayList<NotaCurs> note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return  super.toString() + " NrMatricol=" + NrMatricol + ", an_de_studiu=" + an_de_studiu + ", specializare=" + specializare
				+ ", medieAdmitere=" + medieAdmitere + ", note=" + note + "]";
	}
	
	public void adaugareNota(NotaCurs nota) {
		note.add(nota);
	}
	
	public void afisareNote() {
		for(NotaCurs nota:note) {
			System.out.println(nota);
		}
	}
	
	
	
	
	
}
