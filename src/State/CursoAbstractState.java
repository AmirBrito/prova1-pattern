package State;

import java.util.List;

import model.Course.Snapshot;

public abstract class CursoAbstractState implements CursoStateIF{
	
	@Override
	public CursoStateIF continuar() {
		return this;
	}
	
	@Override
	public CursoStateIF suspender() {
		return this;
	}
	
	@Override
	public CursoStateIF concluir() {
		return this;
	}
	
	@Override
	public CursoStateIF cancelar() {
		return this;
	}
	
	@Override
	public void restore(Snapshot snapshot) {
		return;
	}

	@Override
	public double executar(List<Double> historico) {
		return 0;
	}

}
