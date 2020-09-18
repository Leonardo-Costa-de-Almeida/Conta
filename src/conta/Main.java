package conta;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int escolha = 0;
		String nome = " " ;
		int cdigito = 0 ;
		int saldo =  0;
		
		Conta contas = new Conta(nome, cdigito, saldo);
		
		System.out.println("Olá, bem vindo ao Banco bibitos!");
		
		//criando conta
		System.out.println("Digite seu nome: ");
		nome = contas.getName();
		System.out.println("Muito bem!");
		System.out.println("Agora digite o numero da conta: ");
		cdigito = contas.getCdigitos();
		System.out.println("Sua conta foi criada com sucesso!");
		
		//depois inicial
		System.out.println("deseja realizar um deposito incial?");
		System.out.println("Sim digite 1 / Não digite 2");
		escolha = sc.nextInt();
		if (escolha == 1) {
			
			System.out.println("seu saldo atual é: " + contas.saldo());
		}
		else if(escolha == 2) {
			System.out.println("seu saldo atual é: " + contas.saldo());
		}
		
	
		System.out.println("deseja realizar uma transferencia? P/ saque digite 1 P/ deposito digite 2: ");
		escolha =  sc.nextInt();
		
		if ( escolha == 1) {
			if(contas.saldo() == 0) {
				System.out.println("seu saldo atual é: " + contas.saldo() + " voce nao possui saldo para saque");
			}
			else{
				//pedir valor do saque -3
			}
				
		}else if(escolha == 2) {
			System.out.println("digite o valor do deposito(");
		}
	}

	
	
}
 