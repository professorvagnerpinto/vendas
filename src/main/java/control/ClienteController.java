package control;

import java.util.Scanner;

public class ClienteController {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int opcao = 0;
		do {
			System.out.print("\n\"-------  MENU cliente -------\"");
			System.out.print(
					"\n1. Inserir novo cliente" + 
					"\n2. Atualizar um cliente" +
					"\n3. Listar todos os clientes" + 
					"\n4. Buscar cliente pelo código" + 
					"\n5. Buscar clientes pelo nome"
					+ "\n6. Buscar clientes pela situação" + "\nOpção (Zero p/sair): ");
			opcao = input.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Em implementação. Inserir novo cliente");
				break;
			case 2:
				System.out.println("Em implementação. Atualizar um cliente");
				break;
			case 3:
				System.out.println("Em implementação. Listar todos os clientes");
				break;
			case 4:
				System.out.println("Em implementação. Buscar cliente pelo código");
				break;
			case 5:
				System.out.println("Em implementação. Buscar clientes pelo nome");
				break;
			case 6:
				System.out.println("Em implementação. Buscar clientes pela situação");
			default:
				if (opcao != 0)
					System.out.println("Opção inválida.");
			}
		} while (opcao != 0);

	}

}
