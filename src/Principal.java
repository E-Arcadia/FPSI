import Controle.ControleCliente;
import DAO.ClienteDAO;
import Entidades.Cliente;
import Entidades.Pessoa;
import conexao.CNXHSQLDB;

public class Principal {
	private ControleCliente controleCadastro;
	
	public Principal() {
		controleCadastro = new ControleCliente();
	}

	public static void main(String[] args) {
		//new Principal();
		
//		System.out.println(new CNXHSQLDB().conectar());
		Cliente umCliente = new Cliente("eee", "AAA", "AAA", "AAA");
		ClienteDAO clienteDAO = new ClienteDAO();
		
		clienteDAO.inserirCliente(umCliente);
		for (Cliente umCliente2 : clienteDAO.listarTodosClientes()) {
			System.out.println(umCliente2.toString());
		}
		
	}

}
