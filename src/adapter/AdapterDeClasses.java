package adapter;

import model.Disciplina;

public class AdapterDeClasses extends Disciplina{
	
	private WebinarIF adaptavel;
	
	public AdapterDeClasses(WebinarIF webinar) {
		super(webinar.getTitle(), webinar.getId(), webinar.getPrice());
		this.adaptavel = webinar;
	}
	
	@Override
	public void avancar(Double pctCumprido) {		
		this.adaptavel.play();
	}
	
	@Override
	public double getChTotal() {
		return this.adaptavel.getMinutes();
	}
	
	@Override
	public double getPctCumprido() {
		if(this.adaptavel.wasWatched() == true) {
			return 100;
		}else {
			return 0;
		}
	}
	
	@Override
	public double getPreco() {
		return this.adaptavel.getPrice();
	}

}
