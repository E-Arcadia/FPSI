package View;
import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Dependente;

public class ViewDependente {
	private Scanner teclado;

	public ViewDependente() {
		teclado = new Scanner(System.in);
	}

	public String mostraMenu() {
		System.out.println("	MENU DEPENDENTE");
		System.out.println("	1 - Inserir");
		System.out.println("	2 - Listar");
		System.out.println("	3 - Alterar");
		System.out.println("	4 - Excluir");
		System.out.println("	5 - Sair");
		System.out.println("	Opção: ");
		return teclado.nextLine();
	}

	public Dependente inserir() {
		Dependente umDependente = new Dependente();
		System.out.println(" INSERIR DEPENDENTE");
		System.out.println(" Nome: ");
		umDependente.setNome(teclado.nextLine());

		System.out.println(" E-Mail: ");
		umDependente.setEmail(teclado.nextLine());

		System.out.println(" Fone: ");
		umDependente.setFone(teclado.nextLine());

		System.out.println(" RG: ");
		umDependente.setRG(teclado.nextLine());
		
		return umDependente;
	}

	public void listar(ArrayList<Dependente> listaDependentes) {
		System.out.println("\nLISTA DE CADASTRADOS");
		int pos = 0;
		for (Dependente dependente : listaDependentes) {
			System.out.println("Posição: " + pos++ + " : " + dependente.toString());
		}

	}

	public void alterar(ArrayList<Dependente> listaDependentes) {
		listar(listaDependentes);
		boolean continuar = true;
		int pos = 0;
		do {
			System.out.println("Digite a posição do registro para alter: ");
			try {
				pos = Integer.parseInt(teclado.nextLine());
				if (pos >= 0 & pos < listaDependentes.size()) {
					continuar = false;
				}else {
					System.out.println("Digite um valor válido!");
				}
			} catch (Exception e) {
				System.out.println("Valor digitado inválido!!!");
			}
		} while (continuar);
		
		System.out.println("Nome ("+ listaDependentes.get(pos).getNome() +"): ");
		listaDependentes.get(pos).setNome(teclado.nextLine());
		
		System.out.println("E-Mail ("+ listaDependentes.get(pos).getEmail() +"): ");
		listaDependentes.get(pos).setEmail(teclado.nextLine());
		
		System.out.println("Fone ("+ listaDependentes.get(pos).getFone() +"): ");
		listaDependentes.get(pos).setFone(teclado.nextLine());
		
		System.out.println("Cartão de Crédito: "+ listaDependentes.get(pos).getRG() +"): ");
		listaDependentes.get(pos).setRG(teclado.nextLine());
		
		
	}

}
