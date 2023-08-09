package exercicioStack1;

import java.util.Scanner;
import java.util.Stack;

public class exStack1 {

	public static void main(String[] args) {
		Stack<String> pilhaLivros = new Stack<String>();
		Scanner leia = new Scanner (System.in);
		int livro;
		
		do {
			System.out.println("---------------MENU---------------");
			System.out.println("                                  ");
			System.out.println("----------------------------------");
			System.out.println("    (1) Adicionar Livro na Pilha  ");
			System.out.println("    (2) Listar todos os Livros    ");
			System.out.println("    (3)Retirar Livro da Pilha     ");
			System.out.println("    (0) Sair                       ");
			System.out.println("Digite o número correspondente à opção desejada:   ");
			
			livro = leia.nextInt();
			
			
			switch(livro) {
				case 1:
					leia.nextLine();
				System.out.println("\nAdicionar Livro na Pilha. ");
				System.out.println("\nInforme o título: ");
			    String tituloLivro = leia.nextLine();
			    pilhaLivros.push(tituloLivro);
			      break;
				case 2:
					System.out.println("\nListar todos os livros:  ");
					for(String pilha: pilhaLivros) {
						System.out.println(pilha);
					}
				      break;
				case 3:
					System.out.println("\nRetirar Livro da Pilha. ");
				    if(!pilhaLivros.isEmpty()) {
				    	System.out.println("\nO livro: "+pilhaLivros.pop()+" saiu da sua pilha.");
				    } else {
				    	System.out.println("A pilha está vazia!");
				    }
				      break;
				case 0:
					System.out.println("\nSair. ");
					System.out.println("\nAté a próxima :) ");
				    break;
				default:
					 System.out.println("Ops! Opção inválida!");
				 break;
			}
			      
		} while (livro!=0);
		leia.close();
		
		}
		
			
		

	}


