
public class ContaPoupanca extends Conta {

	double saldoDeposita; 
	
	public ContaPoupanca(int numeroConta, int numeroAgencia, String nomeCliente) {
		super(numeroConta, numeroAgencia, nomeCliente);
	
	}

	public double calcularRendimento() {
		saldoDeposita = (this.getSaldo() * 0.05);
		return saldoDeposita;
		
	}
}
