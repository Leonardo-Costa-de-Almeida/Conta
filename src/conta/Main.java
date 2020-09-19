package conta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int escolha = 0;
		String nome = " ";
		int cdigito = 0;
		int saldo = 0;

		Conta contas = new Conta(nome, cdigito, saldo);

		System.out.println("Olá, bem vindo ao Banco bibitos!");

		// criando conta
		System.out.println("Digite seu nome: ");
		String dnome = sc.next();
		contas.setName(dnome);

		System.out.println("Muito bem!");
		System.out.println("Agora digite o numero da conta: ");
		int ddigitos = sc.nextInt();
		contas.setCdigitos(ddigitos);

		// deposito inicial
		System.out.println("deseja realizar um deposito incial?");
		System.out.println("Sim digite 1 / Não digite 2");
		escolha = sc.nextInt();
		if (escolha == 1) {
			System.out.println("digite o valor que deseja depositar: ");
			int dsaldo = sc.nextInt();
			contas.setSaldo(dsaldo);

		} else if (escolha == 2) {
			System.out.println("seu saldo inicial será 0 ");

		}

		System.out.println("Sua conta foi criada com sucesso!");

		// mostrando dados da conta
		System.out.println("nome: " + contas.getName() + " Digitos: " + contas.getCdigitos() + " saldo: " + contas.saldo() );

		System.out.println("qual operacao deseja realizar? P/ saque digite 1 P/ deposito digite 2 P/ trocar de nome  ");
		escolha = sc.nextInt();

		while(escolha != 0) {
			
			if (escolha == 1) {
				if (contas.saldo() == 0) {
					System.out.println("seu saldo atual é: " + contas.saldo() + " voce nao possui saldo para saque");
				} else {
					// pedir valor do saque -3
					//saque
				}

			} else if (escolha == 2) {
				System.out.println("digite o valor do deposito(");
				//deposito
			}else if(escolha == 3) {
				//troca nome
			}else if(escolha == 0) {
				System.out.println("obrigado por usar o banco do Bibito");
			}
			
		}
		
	sc.close();	
	}

}
