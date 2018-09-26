package View;
import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Pessoa;

public class ViewCadastro {
	private Scanner teclado;

	public ViewCadastro() {
		teclado = new Scanner(System.in);
	}

	public String mostraMenu() {
		System.out.println("MENU");
		System.out.println("1 - Inserir");
		System.out.println("2 - Listar");
		System.out.println("3 - Alterar");
		System.out.println("4 - Excluir");
		System.out.println("5 - Sair");
		System.out.println("Opção: ");
		return teclado.nextLine();
	}

	public Pessoa inserir() {
		Pessoa umaPessoa = new Pessoa();
		System.out.println("INSERIR");
		System.out.println("Nome: ");
		umaPessoa.setNome(teclado.nextLine());

		System.out.println("E-Mail: ");
		umaPessoa.setEmail(teclado.nextLine());

		System.out.println("Fone: ");
		umaPessoa.setFone(teclado.nextLine());

		return umaPessoa;
	}

	public void listar(ArrayList<Pessoa> agenda) {
		System.out.println("\nLISTA DE CADASTRADOS");
		int pos = 0;
		for (Pessoa pessoa : agenda) {
			System.out.println("Posição: " + pos++ + " : " + pessoa.toString());
		}

	}

	public void alterar(ArrayList<Pessoa> agenda) {
		listar(agenda);
		boolean continuar = true;
		int pos = 0;
		do {
			System.out.println("Digite a posição do registro para alter: ");
			try {
				pos = Integer.parseInt(teclado.nextLine());
				if (pos >= 0 & pos < agenda.size()) {
					continuar = false;
				}else {
					System.out.println("Digite um valor válido!");
				}
			} catch (Exception e) {
				System.out.println("Valor digitado inválido!!!");
			}
		} while (continuar);
		
		System.out.println("Nome ("+ agenda.get(pos).getNome() +"): ");
		agenda.get(pos).setNome(teclado.nextLine());
		
		System.out.println("E-Mail ("+ agenda.get(pos).getEmail() +"): ");
		agenda.get(pos).setEmail(teclado.nextLine());
		
		System.out.println("Fone ("+ agenda.get(pos).getFone() +"): ");
		agenda.get(pos).setFone(teclado.nextLine());
		
		
	}

}
