package model;

public class Disciplina extends Product {

	private Integer chTotal;
	private Double pctCumprido;

	public Disciplina(String name, String code, Double price, Integer chTotal) {
		super(name, code, price);
		this.chTotal = chTotal;
		this.pctCumprido = 0.00;
	}

	public Double getPctCumprido() {
		return pctCumprido;
	}

	public void setPctCumprido(Double pctCumprido) {
		this.pctCumprido = pctCumprido;
	}

	public Integer getChTotal() {
		return chTotal;
	}

	@Override
	public String toString() {
		return "Disciplina [name=" + getName() + ", code=" + getCode() + ", price=" + getPrice() + ", chTotal=" + getChTotal() + "]";
	}	

}
