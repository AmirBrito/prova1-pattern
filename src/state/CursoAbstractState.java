package state;

import java.util.List;

import interfaces.ObserverIF;
import state.Course;
import state.Course.Snapshot;

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
	public void  getSnapshot(Course curso) {
		return ;
		
		
	}
	
	@Override
	public void imprimirCertificado(Course curso) {
		
		return;
	}

	
	

}
