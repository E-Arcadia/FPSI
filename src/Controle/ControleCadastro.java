package Controle;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import Entidades.Cliente;
import Entidades.Pessoa;
import View.ViewCadastro;

public class ControleCadastro {
	private ViewCadastro viewCadastro;
	private ArrayList<Cliente> agenda;

	public ControleCadastro() {
		viewCadastro = new ViewCadastro();
		trataMenu();
		agenda = new ArrayList<>();
	}

	private void trataMenu() {
		boolean continuar = true;
		do {
			String opc = viewCadastro.mostraMenu();

			switch (opc) {
			case "1":
				 agenda.add(viewCadastro.inserir());
				break;
			case "2":
				viewCadastro.listar(agenda);
				break;
			case "3":
				viewCadastro.alterar(agenda);
				break;
			case "4":
				System.out.println("Excluir");
				break;
			case "5":
				System.out.println("Sair do menu");
				continuar = false;
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		} while (continuar);
	}
}
