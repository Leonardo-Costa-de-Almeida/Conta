package conta;



public class Conta {
	
	String name;
	int cdigitos;
	double saldo;

	// constructor
	public Conta(String name, int cdigitos, double saldo) {

		this.name = name;
		this.cdigitos = cdigitos;
		this.saldo = saldo;

	}

	// methods
	public String getName() {
		
		
		return this.name;
	}

	public int getCdigitos() {
		
		return cdigitos;
	}

	public double saldo() {
		
		return saldo;
	}
	
	

	public void setName(String nome) {
		
		this.name = nome;
		
		
	}
	
	public void setCdigitos(int digitos) {
		this.cdigitos = digitos;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
