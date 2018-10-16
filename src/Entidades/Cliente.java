package Entidades;

import java.util.ArrayList;

public class Cliente extends Pessoa {
	private String cartaoCredito;
	private ArrayList<Dependente> dependentes;
	
	
	public Cliente() {
		this.dependentes = new ArrayList<>();
	}	
	
	public Cliente(String nome, String email, String fone, String cartaoCredito) {
		super(0, nome, email, fone);
		this.cartaoCredito = cartaoCredito;
		this.dependentes = new ArrayList<>();
	}
	
	public Cliente(int id, String nome, String email, String fone, String cartaoCredito) {
		super(id, nome, email, fone);
		this.cartaoCredito = cartaoCredito;
		this.dependentes = new ArrayList<>();
	}

	public String getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(String cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	
	public void addDependentes(Dependente dependente) {
		this.dependentes.add(dependente);
	}
	
	public void removeDependentes(Dependente dependente) {
		this.dependentes.remove(dependente);
	}
	
	public ArrayList<Dependente> getDependente(){
		return this.dependentes;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cartaoCredito == null) ? 0 : cartaoCredito.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cartaoCredito == null) {
			if (other.cartaoCredito != null)
				return false;
		} else if (!cartaoCredito.equals(other.cartaoCredito))
			return false;
		return true;
	}





	@Override
	public String toString() {
		return "Cliente [cartaoCredito=" + cartaoCredito + ", dependentes=" + dependentes + ", toString()="
				+ super.toString() + "]";
	}

	public String mostraDados() {
		return "Cliente: Cartao Credito=" + cartaoCredito 
				+ ", Nome=" + getNome() 
				+ ", E-mail()=" + getEmail()
				+ ", Fone()=" + getFone() + "]"
				+ "Total de Dependentes:" + this.dependentes.size();
	}
	
}
