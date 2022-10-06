import java.util.Scanner;

public class TestaBanco {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcaoconta;

		do {

			System.out.println("====== Bem-vindo ao Banco Blablablá ======");
			System.out.println("");
			System.out.println("Digite a opção de conta que você deseja criar");
			System.out.println("==== 1 - Conta Corrente ====");
			System.out.println("==== 2 - Conta Poupança ====");
			System.out.println("==== 3 - Sair ====");
			System.out.println("Opção: ");
			opcaoconta = scanner.nextInt();

		} while ((opcaoconta != 1) && (opcaoconta != 2));

		switch (opcaoconta) {
		case 1:

			System.out.println("==== Criar nova conta Corrente ====");
			System.out.println("Digite a agência: ");
			int agencia = scanner.nextInt();
			System.out.println("Digite o número: ");
			int numero = scanner.nextInt();
			System.out.println("Digite o nome do Cliente: ");
			String nome = scanner.next();
			System.out.println("Conta cadastrada com sucesso!");
			ContaCorrente cc = new ContaCorrente(agencia, numero, nome);

			int opcaomenu;

			do {
				System.out.println("");
				System.out.println("---- MENU ----");
				System.out.println(" 1 - Dados Bancários");
				System.out.println(" 2 - Depósito");
				System.out.println(" 3 - Saque");
				System.out.println(" 0 - Sair");
				System.out.println("Escolha uma opção:");
				opcaomenu = scanner.nextInt();

				switch (opcaomenu) {
				case 1:
					System.out.println(cc.dadosBancarios());
					break;

				case 2:
					System.out.println("Digite a quantia que você deseja depositar: ");
					double quantiadeposito = scanner.nextDouble();
					cc.deposita(quantiadeposito);
					break;

				case 3:
					System.out.println("Digite a quantia que você deseja sacar: ");
					double quantiasaque = scanner.nextDouble();
					cc.saque(quantiasaque);
					break;

				case 0:
					System.out.println("Programa finalizado!");
					break;

				default:
					System.out.println("opção inválida!");
				}

			} while ((opcaomenu < 4) && (opcaomenu != 0));

		case 2:

			System.out.println("==== Criar nova conta Poupança ===");
			System.out.println("Digite a agência: ");
			int agencia2 = scanner.nextInt();
			System.out.println("Digite o número: ");
			int numero2 = scanner.nextInt();
			System.out.println("Digite o nome do Cliente: ");
			String nome2 = scanner.next();
			System.out.println("Conta cadastrada com sucesso!");
			ContaPoupanca cp = new ContaPoupanca(agencia2, numero2, nome2);

			int opcaomenu2;

			do {
				System.out.println("");
				System.out.println("---- MENU ----");
				System.out.println(" 1 - Dados Bancários");
				System.out.println(" 2 - Depósito");
				System.out.println(" 3 - Saque");
				System.out.println(" 4 - Rendimento mensal");
				System.out.println(" 0 - Sair");
				System.out.println("Escolha uma opção:");
				opcaomenu2 = scanner.nextInt();

				switch (opcaomenu2) {
				case 1:
					System.out.println(cp.dadosBancarios());
					break;

				case 2:
					System.out.println("Digite a quantia que você deseja depositar: ");
					double quantiadeposito = scanner.nextDouble();
					cp.deposita(quantiadeposito);
					break;

				case 3:
					System.out.println("Digite a quantia que você deseja sacar: ");
					double quantiasaque = scanner.nextDouble();
					cp.saque(quantiasaque);

				case 4:
					System.out.println(" O seu rendimento mensal foi de: R$ " + cp.calcularRendimento());
					System.out.println("O valor total do seu saldo com o rendimento é de R$ : "
							+ (cp.calcularRendimento() + cp.getSaldo()));
					break;

				case 0:
					System.out.println("Programa finalizado!");
					break;

				default:
					System.out.println("opção inválida!");
					break;
				}
			} while (opcaomenu2 != 0);
			break;

		}
		while (opcaoconta != 0);
	}
}

		
		


