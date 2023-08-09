package exercicioqueue1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exqueue1 {

	public static void main(String[] args) {
		Queue<String> MenuBanco = new LinkedList<String>();
		Scanner OpcaoSelect = new Scanner(System.in);
		
		int opcao;
		do {
			System.out.println("---------------MENU---------------");
			System.out.println("                                  ");
			System.out.println("----------------------------------");
			System.out.println("    (1) Adicionar Cliente na Fila  ");
			System.out.println("    (2) Listar todos os Cliente    ");
			System.out.println("    (3)Retirar Clientes da Fila   ");
			System.out.println("    (0) Sair                       ");
			System.out.println("Digite o número correspondente à opção desejada:   ");
			
			opcao = OpcaoSelect.nextInt();
			
		
		switch(opcao) {
		case 1:
			 System.out.println("Adicionar Cliente na Fila\n\n");
			 System.out.println("\n\tFavor inserir o nome do cliente: ");
			 OpcaoSelect.nextLine();
			 String ClienteNome = OpcaoSelect.next();
			  MenuBanco.add(ClienteNome);
			 break;
		case 2:
			 System.out.println("Listar todos os clientes\n\n");
			 for(String cliente : MenuBanco) {
				 System.out.println(cliente);
			 }
			 break;
		case 3:
			 System.out.println("Retirar Clientes da Fila\n\n");
			 if(!MenuBanco.isEmpty()) {
			 System.out.println("O cliente: "+MenuBanco.remove()+" foi retirado.");
			 }else {
				 System.out.println("A fila está vazia!");
			 }
			 break;
		case 0:
			 System.out.println("Sair\n\n");
			 System.out.println("\nObrigada por utilizar nosso sistema, volte sempre!");
		break;	
		default:
				 System.out.println("Ops! Opção inválida!");
			 break;
		}
		
		} while(opcao!=0);
        OpcaoSelect.close();
	}
}


