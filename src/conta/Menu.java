package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {

		//Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "João", 0.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(500.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();

		//Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(2, 123, 1, "Mariane", 15000f, 1000.0f, 0);
		cp1.visualizar();
		cp1.sacar(1050.0f);
		cp1.visualizar();
		cp1.depositar(10000.0f);
		cp1.visualizar();

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "********************************************************");
			System.out.println("                                                        ");
			System.out.println("                 BANCO DOS ATREIDES                     ");
			System.out.println("                                                        ");
			System.out.println("********************************************************");
			System.out.println("                                                        ");
			System.out.println("           1 - Criar uma conta                          ");
			System.out.println("           2 - Listar todas as contas                   ");
			System.out.println("           3 - Buscar a conta por número                ");
			System.out.println("           4 - Atualiza os dados da conta               ");
			System.out.println("           5 - Deletar conta                            ");
			System.out.println("           6 - Sacar                                    ");
			System.out.println("           7 - Depositar                                ");
			System.out.println("           8 - Transferir valores entre contas          ");
			System.out.println("           9 - Sair                                     ");
			System.out.println("                                                        ");
			System.out.println("********************************************************");
			System.out.println("Entre com a opção desejada:                             ");
			System.out.println("                                                        " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco dos Atreides - Aqui seu dinheiro rende!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar uma conta\n\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as contas\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da conta - por número\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar os dados da conta\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Deletar a conta\n\n");

				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");

				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");

				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre as contas\n\n");

				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOps, essa opção é inválida!\n" + Cores.TEXT_RESET);
				break;
			}
		}

	}

}