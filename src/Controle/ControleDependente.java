package Controle;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import Entidades.Cliente;
import Entidades.Dependente;
import Entidades.Pessoa;
import View.ViewCadastro;
import View.ViewDependente;

public class ControleDependente {
	private ViewDependente viewDependente;
	private Cliente cliente;

	public ControleDependente(Cliente cliente) {
		viewDependente = new ViewDependente();
		this.cliente = cliente;
		this.trataMenu();
	}

	
	private void trataMenu() {
		boolean continuar = true;
		do {
			String opc = viewDependente.mostraMenu();

			switch (opc) {
			case "1":
				 cliente.getDependente().add(viewDependente.inserir());
				break;
			case "2":
				viewDependente.listar(cliente.getDependente());
				break;
			case "3":
				viewDependente.alterar(cliente.getDependente());
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
