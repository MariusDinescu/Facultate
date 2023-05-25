
public class Curs {

	protected int cursID;
	protected String denumire;
	protected String titular;
	
	
	public Curs(int cursID, String denumire, String titular) {
		super();
		this.cursID = cursID;
		this.denumire = denumire;
		this.titular = titular;
	}


	public int getCursID() {
		return cursID;
	}


	public void setCursID(int cursID) {
		this.cursID = cursID;
	}


	public String getDenumire() {
		return denumire;
	}


	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	@Override
	public String toString() {
		return "Curs [cursID=" + cursID + ", denumire=" + denumire + ", titular=" + titular + "]";
	}
	
	
	
	
}
