
public abstract class Conta {

	private int numeroConta;
	private int numeroAgencia;
	private String nomeCliente;
	private double saldo;
	
	
	
	public Conta(int numeroConta, int numeroAgencia, String nomeCliente) {
		super();
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.nomeCliente = nomeCliente;
	
	}

	public int getNumeroConta() {
		return numeroConta;
	}



	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}



	public int getNumeroAgencia() {
		return numeroAgencia;
	}



	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}



	public String getNomeCliente() {
		return nomeCliente;
	}



	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void saque(double valor) {
		if(this.saldo >= valor) {
		this.saldo = this.saldo - valor; 
		System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Você não tem saldo suficiente! ");
		}
	}
		
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("Depósito realizado com sucesso!");
	}
	
	public String dadosBancarios() {
		String dados = "";
		dados = dados + "Nome do Cliente: " + nomeCliente + "\n";
		dados = dados + "Número da conta: " + numeroConta + "\n";
		dados = dados + "Número da agência: " + numeroAgencia + "\n";
		dados = dados + " Saldo da conta: " + saldo + "\n";
		return dados;
	}

	}

