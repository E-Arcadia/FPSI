package Entidades;

public class Dependente extends Pessoa {
	private String RG;

	public Dependente() {
	}
	
	public Dependente(String nome, String email, String fone, String rG) {
		super(0,nome, email, fone);
		RG = rG;
	}
	
	public Dependente(int id,String nome, String email, String fone, String rG) {
		super(id,nome, email, fone);
		RG = rG;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((RG == null) ? 0 : RG.hashCode());
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
		Dependente other = (Dependente) obj;
		if (RG == null) {
			if (other.RG != null)
				return false;
		} else if (!RG.equals(other.RG))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dependente [RG=" + RG + ", toString()=" + super.toString() + "]";
	}

}
