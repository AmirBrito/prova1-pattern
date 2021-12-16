package model;

public class Disciplina extends Product {

	private int chTotal = 0;
	private Double pctCumprido = 0.00;
	protected Boolean concluida = false;

	public Disciplina(String name, String code, Double price) {
		super(name, code, price);
		this.pctCumprido = 0.00;
	}

	public Double getPctCumprido() {
		return pctCumprido;
	}

	public void setPctCumprido(Double pctCumprido) {
		this.pctCumprido = pctCumprido;
		setConcluida(pctCumprido);
	}
	
	private void setConcluida(Double pctCumprido) {
		Double pct = 100.00;
		if(pctCumprido.equals(pct)){
			this.concluida = true;
		}
	}
	
	public Boolean getConcluida() {
		return concluida;
	}

	public Integer getChTotal() {
		return chTotal;
	}
	
	public void setChTotal(Integer chTotal) {
		this.chTotal = chTotal;
	}
	
	//*************************************
	
	public void addCHT(int cht) {
		
		this.chTotal = this.chTotal + cht;

	}
	public void minusCHT(int cht) {
		
		this.chTotal = this.chTotal - cht;

	}
	


	@Override
	public String toString() {
		return "Disciplina [name=" + getName() + ", code=" + getCode() + ", price=" + getPrice() + ", chTotal=" + getChTotal() + " Pct Cumprido: " + getPctCumprido() + " Concluida: " + getConcluida() + "]\n";
	}	

}
