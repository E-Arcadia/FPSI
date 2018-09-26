import Controle.ControleCadastro;
import Entidades.Pessoa;

public class Principal {
	private ControleCadastro controleCadastro;
	
	public Principal() {
		controleCadastro = new ControleCadastro();
	}

	public static void main(String[] args) {
		new Principal();
//		Pessoa umaPessoa = new Pessoa();
		Pessoa outraPessoaA = new Pessoa("AA","AA@AA","22222");
//		Pessoa outraPessoaB = new Pessoa("BB","BB@BB","33333");
//		
//		
//		System.out.println(umaPessoa +" - ");
		System.out.println(outraPessoaA.toString()+" - ");
//		System.out.println(outraPessoaB +" - ");
	}

}
