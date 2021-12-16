package State;

import java.util.List;

import State.Course;
import State.Course.Snapshot;
import interfaces.ObserverIF;

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
