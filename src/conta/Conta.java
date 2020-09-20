package conta;



public class Conta {
    
    // `private` para não expor diretamente os atributos para classes externas
	private String name;
	private int cdigitos;
	private double saldo = 0;

	// constructor
	public Conta(String name, int cdigitos) {

		this.name = name;
		this.cdigitos = cdigitos;

	}

	// methods
	public String getName() {
		return this.name;
	}

	public int getCdigitos() {
		
		return cdigitos;
	}

	public double getSaldo() {
		
		return saldo;
	}
	
	public void setName(String nome) {
		
		this.name = nome;
		
	}
	
	public void setCdigitos(int digitos) {
		this.cdigitos = digitos;
	}
	
	public void depositar(double valor) {
        if (valor < 0) {
            System.out.println("Valor para depósito inválido");
        } else {
            this.saldo += valor;
        }
		
    }

    public void sacar(double valor) {
        double taxa = 3.00;

        if (valor < 0) {
            System.out.println("Valor para saque inválido");
        } else {
            double novoSaldo = this.saldo - valor - taxa;

            if (novoSaldo < 0) {
                System.out.println("Não é possível sacar um valor maior do que o contido na conta");
                System.out.println("Saldo atual: " + this.saldo);
            } else {
                this.saldo = novoSaldo;
            }
        }
		
    }
}
