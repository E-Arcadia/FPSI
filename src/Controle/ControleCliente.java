package Controle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import Entidades.Cliente;
import Entidades.Pessoa;
import View.ViewCliente;

public class ControleCliente {
	private ViewCliente viewCadastro;
	private ArrayList<Cliente> listaClientes;

	public ControleCliente() {
		viewCadastro = new ViewCliente();
		listaClientes = new ArrayList<>();
		trataMenu();
	}

	private void trataMenu() {
		boolean continuar = true;
		do {
			String opc = viewCadastro.mostraMenu();

			switch (opc) {
			case "1":
				Cliente umCliente = viewCadastro.inserir();
				listaClientes.add(umCliente);
				String cadastrarDependente = viewCadastro.cadastraDependente();
				if (cadastrarDependente.toUpperCase().startsWith("S")) {
					new ControleDependente(umCliente);
				}

				break;
			case "2":
				viewCadastro.listar(listaClientes);
				break;
			case "3":
				viewCadastro.alterar(listaClientes);
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
