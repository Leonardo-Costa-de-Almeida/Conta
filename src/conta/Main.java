package conta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int escolha = 0;

		System.out.println("Olá, bem vindo ao Banco bibitos!");

		// criando conta
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();

		System.out.println("Muito bem!");
		System.out.println("Agora digite o numero da conta: ");
        int digitos = sc.nextInt();
        
        Conta conta = new Conta(nome, digitos);

		// deposito inicial
		System.out.println("deseja realizar um deposito incial?");
        System.out.println("Sim digite 1 / Não digite 2");
    
		escolha = sc.nextInt();
		if (escolha == 1) {
            System.out.println("digite o valor que deseja depositar: ");
            // Fazer o `setSaldo()` direto pode ser ruim pois há o risco de fazer o saldo da conta "pular"
            // de um valor para outro
			double valor = sc.nextDouble();
			conta.depositar(valor);

		} else if (escolha == 2) {
			System.out.println("seu saldo inicial será R$0.00 ");

		}

		System.out.println("Sua conta foi criada com sucesso!");

		// mostrando dados da conta
		System.out.println(
				"nome: " + conta.getName() + " Digitos: " + conta.getCdigitos() + " saldo: " + conta.getSaldo());

		System.out.println(
                "qual operacao deseja realizar? ||P/ saque digite 1 ||P/ deposito digite 2|| P/ trocar de nome digite 3||  ");
		escolha = sc.nextInt();

		while (escolha != 0) {

			if (escolha == 1) {

				System.out.println("Digite o valor do saque: ");

				double valor = sc.nextDouble();
				conta.sacar(valor);
				System.out.println("seu novo saldo: " + conta.getSaldo());

			} else if (escolha == 2) {
				System.out.println("digite o valor do deposito: ");
				double valor = sc.nextDouble();
				conta.depositar(valor);
				System.out.println("seu novo saldo: " + conta.getSaldo());
			} else if (escolha == 3) {
				System.out.println("digite o seu novo nome: ");
				String newname = sc.nextLine();
				conta.setName(newname);
				System.out.println("seu novo nome �: " + conta.getName());
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
