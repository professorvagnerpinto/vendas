package control;

import java.util.Scanner;

public class HomeController {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int opcao = 0;
		do {
			System.out.print("\n-------  Home -------");
			System.out.print(		
				"\n1. Vender" +
				"\n2. Manter Produtos" +
				"\n3. Manter Clietnes" +
				"\n4. Listar pedidos por cliente" +
				"\nOpção (Zero p/sair): ");
			opcao = input.nextInt();
			switch(opcao) {
				case 1:
					System.out.println("Em implementação.");
					break;
				case 2:
                    ProdutoController.main(null);
					break;
				case 3:
					System.out.println("Em implementação.");
					break;
				case 4:
					System.out.println("Em implementação.");
					break;
				default:
					if(opcao != 0) System.out.println("Opção inválida.");
			}
		} while(opcao != 0) ;
		System.out.println("Fim da aplicação");
	}

}//fim classe
