
public class Angajat extends Persoana{
	
	protected double salariu;
	protected int vechime;
	
	
	public Angajat(String nume, String prenume, String adresa, String email, double salariu, int vechime) {
		super(nume, prenume, adresa, email);
		this.salariu = salariu;
		this.vechime = vechime;
	}
	public double getSalariu() {
		return salariu;
	}
	public void setSalariu(double salariu) {
		this.salariu = salariu;
	}
	public int getVechime() {
		return vechime;
	}
	public void setVechime(int vechime) {
		this.vechime = vechime;
	}
	@Override
	public String toString() {
		return super.toString() + " [salariu=" + salariu + ", vechime=" + vechime + "]";
	}

	
	
	
	
	

}
