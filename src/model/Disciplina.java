package model;

import composite.componentCursavelIF;

public class Disciplina extends Product implements componentCursavelIF{

	private int chTotal = 0;
	private Double pctCumprido = 0.00;
	protected Boolean concluida = false;
	
	public Disciplina() {
		
	}
	public Disciplina(String name, String code, Double price) {
		super(name, code, price);
		this.pctCumprido = 0.00;
	}

	public double getPctCumprido() {
		return pctCumprido;
	}

	public void avancar(Double pctCumprido) {		
		this.pctCumprido += pctCumprido;
		setConcluida(pctCumprido);
	}
	
	private void setConcluida(Double pctCumprido) {
		Double pct = 100.00;
		if(pctCumprido.equals(pct)){
			this.concluida = true;
		}
	}
	
	public Boolean getConcluida() {
		return this.concluida;
	}

	public double getChTotal() {
		return this.chTotal;
	}
	
	public void setChTotal(Integer chTotal) {
		this.chTotal = chTotal;
	}
	
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

	@Override
	public double getPreco() {
		return this.price;
	}	

}
