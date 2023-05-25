import java.util.ArrayList;

public class Specializare {

	protected int idSpecializare;
	protected String denumire;
	protected ArrayList<Curs> cursuri;
	protected String responsabil;
	
	
	public Specializare(int idSpecializare, String denumire, ArrayList<Curs> cursuri, String responsabil) {
		super();
		this.idSpecializare = idSpecializare;
		this.denumire = denumire;
		this.cursuri = cursuri;
		this.responsabil = responsabil;
	}
	@Override
	public String toString() {
		return "Specializare [idSpecializare=" + idSpecializare + ", denumire=" + denumire + ", cursuri=" + cursuri
				+ ", responsabil=" + responsabil + "]";
	}
	public int getIdSpecializare() {
		return idSpecializare;
	}
	public void setIdSpecializare(int idSpecializare) {
		this.idSpecializare = idSpecializare;
	}
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public ArrayList<Curs> getCursuri() {
		return cursuri;
	}
	public void setCursuri(ArrayList<Curs> cursuri) {
		this.cursuri = cursuri;
	}
	public String getResponsabil() {
		return responsabil;
	}
	public void setResponsabil(String responsabil) {
		this.responsabil = responsabil;
	}
	
	
}
