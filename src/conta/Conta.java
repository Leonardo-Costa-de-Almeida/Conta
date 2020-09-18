package conta;

public class Conta {

	String name;
	int cdigitos;
	int saldo;
	
	//constructor
	public Conta(String name, int cdigitos, int saldo) 
	    { 
	        this.name = name; 
	        this.cdigitos = cdigitos; 
	        this.saldo = saldo; 
	     
	    }
	
	//methods
	public String getName() {
		return name;
	}
	
	public int getCdigitos() {
		return cdigitos;
	}
	
	public int saldo() {
		return saldo;
	}
}
