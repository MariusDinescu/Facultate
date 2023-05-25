
public class NotaCurs {

	protected int cursID;
	protected double nota;
	
	
	@Override
	public String toString() {
		return "NotaCurs [cursID=" + cursID + ", nota=" + nota + "]";
	}


	public NotaCurs(int cursID, double nota) {
		super();
		this.cursID = cursID;
		this.nota = nota;
	}


	public int getCursID() {
		return cursID;
	}


	public void setCursID(int cursID) {
		this.cursID = cursID;
	}


	public double getNota() {
		return nota;
	}


	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
	
	
}
