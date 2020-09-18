package conta;

import java.util.Scanner;

public class Conta {
	Scanner sc = new Scanner(System.in);
	String name;
	int cdigitos;
	int saldo;

	// constructor
	public Conta(String name, int cdigitos, int saldo) {

		this.name = name;
		this.cdigitos = cdigitos;
		this.saldo = saldo;

	}

	// methods
	public String getName() {
		name = sc.next();
		
		return name;
	}

	public int getCdigitos() {
		cdigitos = sc.nextInt();
		return cdigitos;
	}

	public int saldo() {
		saldo = sc.nextInt();
		return saldo;
	}
}
