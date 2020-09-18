package conta;

import java.util.Scanner;


public class Main {
	
	Scanner sc = new Scanner(System.in);

	private String nome;
	private int cdigito;
	private int saldo;
	
	Conta contas = new Conta(nome, cdigito, saldo);
	System.out.println("1 Alcool / 2 Gasolina / 3 Disel");
}
 