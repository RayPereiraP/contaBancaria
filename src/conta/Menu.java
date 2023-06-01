package conta;

import conta.util.*;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
		int opcao;
				
		while(true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DOS ATREIDES                   ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Para criar a conta                   ");
			System.out.println("            2 - Listar todas as contas               ");
			System.out.println("            3 - Buscar a conta por número            ");
			System.out.println("            4 - Atualizar os dados da conta          ");
			System.out.println("            5 - Apagar conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre as contas   ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada por gentileza:            ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			opcao = leia.nextInt();
				
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				leia.close();
				System.exit(0);
			}
				
			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE + "Para criar a conta\n\n");
				
                    break;
				case 2:
					System.out.println(Cores.TEXT_WHITE + "Listar todas as contas\n\n");
					
                    break;
				case 3:
					System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - pelo número\n\n");
	
                    break;
				case 4:
					System.out.println(Cores.TEXT_WHITE + "Atualizar os dados da conta\n\n");
					
                    break;
				case 5:
					System.out.println(Cores.TEXT_WHITE + "Apagar conta\n\n");
		
                    break;
				case 6:
					System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

                    break;
				case 7:
					System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");
					
                    break;
				case 8:
					System.out.println(Cores.TEXT_WHITE + "Transferência entre as contas\n\n");
					
                    break;
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
                    break;
			}
		}	
    }
}