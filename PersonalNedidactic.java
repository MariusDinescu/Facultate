
public class PersonalNedidactic extends Angajat{

	protected String functie;

	public PersonalNedidactic(String nume, String prenume, String adresa, String email, double salariu, int vechime,
			String functie) {
		super(nume, prenume, adresa, email, salariu, vechime);
		this.functie = functie;
	}

	public String getFunctie() {
		return functie;
	}

	public void setFunctie(String functie) {
		this.functie = functie;
	}

	@Override
	public String toString() {
		return  super.toString() + " functie=" + functie + "]";
	}
	
	
	
	
	
}
