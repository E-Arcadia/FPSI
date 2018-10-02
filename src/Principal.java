import Controle.ControleCadastro;
import Entidades.Pessoa;

public class Principal {
	private ControleCadastro controleCadastro;
	
	public Principal() {
		controleCadastro = new ControleCadastro();
	}

	public static void main(String[] args) {
		new Principal();
	}

}
