import Controle.ControleCliente;
import Entidades.Pessoa;

public class Principal {
	private ControleCliente controleCadastro;
	
	public Principal() {
		controleCadastro = new ControleCliente();
	}

	public static void main(String[] args) {
		new Principal();
	}

}
