
public class Persoana {

	protected String nume;
	protected String prenume, adresa, email;
	
	public Persoana(String nume, String prenume, String adresa, String email) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.adresa = adresa;
		this.email = email;
	}

	

	@Override
	public String toString() {
		return "Persoana [nume=" + nume + ", prenume=" + prenume + ", adresa=" + adresa + ", email=" + email + "]";
	}



	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}
