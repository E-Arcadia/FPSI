package Entidades;

public class Cliente extends Pessoa {
	private String cartaoCredito;
	
	
	public Cliente(String nome, String email, String fone, String cartaoCredito) {
		super(nome, email, fone);
		this.cartaoCredito = cartaoCredito;
	}

	public Cliente() {
		
	}

	public String getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(String cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
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
		return "Cliente [cartaoCredito=" + cartaoCredito + ", getNome()=" + getNome() + ", getEmail()=" + getEmail()
				+ ", getFone()=" + getFone() + "]";
	}


	
	
}
