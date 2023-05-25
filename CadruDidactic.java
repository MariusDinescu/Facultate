
public class CadruDidactic  extends Angajat{

	protected String titulatura;

	public CadruDidactic(String nume, String prenume, String adresa, String email, double salariu, int vechime,
			String titulatura) {
		super(nume, prenume, adresa, email, salariu, vechime);
		this.titulatura = titulatura;
	}
	
	

	public String getTitulatura() {
		return titulatura;
	}



	public void setTitulatura(String titulatura) {
		this.titulatura = titulatura;
	}



	@Override
	public String toString() {
		return  super.toString() + " titulatura=" + titulatura + "]";
	}
	
	
}
