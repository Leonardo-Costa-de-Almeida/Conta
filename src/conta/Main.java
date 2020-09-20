package conta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int escolha = 0;
		String nome = " ";
		int cdigito = 0;
		double saldo = 0;

		Conta contas = new Conta(nome, cdigito, saldo);

		System.out.println("Ol�, bem vindo ao Banco bibitos!");

		// criando conta
		System.out.println("Digite seu nome: ");
		String dnome = sc.nextLine();
		contas.setName(dnome);

		System.out.println("Muito bem!");
		System.out.println("Agora digite o numero da conta: ");
		int ddigitos = sc.nextInt();
		contas.setCdigitos(ddigitos);

		// deposito inicial
		System.out.println("deseja realizar um deposito incial?");
		System.out.println("Sim digite 1 / N�o digite 2");
		escolha = sc.nextInt();
		if (escolha == 1) {
			System.out.println("digite o valor que deseja depositar: ");
			double dsaldo = sc.nextDouble();
			contas.setSaldo(dsaldo);

		} else if (escolha == 2) {
			System.out.println("seu saldo inicial ser� 0 ");

		}

		System.out.println("Sua conta foi criada com sucesso!");

		// mostrando dados da conta
		System.out.println(
				"nome: " + contas.getName() + " Digitos: " + contas.getCdigitos() + " saldo: " + contas.saldo());

		System.out.println(
                "qual operacao deseja realizar? ||P/ saque digite 1 ||P/ deposito digite 2|| P/ trocar de nome digite 3||  ");
		escolha = sc.nextInt();

		while (escolha != 0) {

			if (escolha == 1) {

				System.out.println("Digite o valor do saque: ");

				double newsaldo = sc.nextDouble();
				saldo = contas.saldo();
				saldo = saldo - newsaldo - 3;
				contas.setSaldo(saldo);
				System.out.println("seu novo saldo: " + contas.saldo());

			} else if (escolha == 2) {
				System.out.println("digite o valor do deposito: ");
				double newsaldo = sc.nextDouble();
				saldo = contas.saldo();
				saldo = saldo + newsaldo;
				contas.setSaldo(saldo);
				System.out.println("seu novo saldo: " + contas.saldo());
			} else if (escolha == 3) {
				System.out.println("digite o seu novo nome: ");
				String newname = sc.nextLine();
				contas.setName(newname);
				System.out.println("seu novo nome �: " + contas.getName());
			}else {
				System.out.println("digite uma escolha valida");
			}
			
			System.out.println("qual operacao deseja realizar? ||P/ saque digite 1 ||P/ deposito digite 2|| P/ trocar de nome digite 3||  ");

			escolha = sc.nextInt();
		}

		System.out.println("obrigado por usar o banco do Bibito");

		sc.close();
	}

}
