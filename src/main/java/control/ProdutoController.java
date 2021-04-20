package control;

import java.util.Scanner;

import dao.ProdutoDAO;

public class ProdutoController {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int opcao = 0;
		do {
			System.out.print("\n\"-------  MENU PRODUTO -------\"");
			System.out.print(		
				"\n1. Inserir novo produto" +
				"\n2. Atualizar um produto" +
				"\n3. Listar todos os produtos" +
				"\n4. Buscar produto pelo código" +
				"\n5. Buscar produtos pelo nome" +
				"\n6. Buscar produtos pela situação" +
				"\nOpção (Zero p/sair): ");
			opcao = input.nextInt();
			switch(opcao) {
				case 1:
					System.out.println("Em implementação. Inserir novo produto");
					break;
				case 2:
					System.out.println("Em implementação. Atualizar um produto");
					break;
				case 3:
					selectProdutos();
					break;
				case 4:
					System.out.println("Em implementação. Buscar produto pelo código");
					break;
				case 5:
					System.out.println("Em implementação. Buscar produtos pelo nome");
					break;
				case 6:
					System.out.println("Em implementação. Buscar produtos pela situação");	
				default:
					if(opcao != 0) System.out.println("Opção inválida.");
			}
		} while(opcao != 0) ;	
	}
	
	private static void selectProdutos() {
		System.out.println("\nLista de produtos cadastrados no banco de dados:\n" + ProdutoDAO.selectProdutos());
	}

}
