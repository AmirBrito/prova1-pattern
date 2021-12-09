package State;

import java.util.List;

import State.Course;
import State.Course.Snapshot;

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
	
	//@Override
	public Snapshot getSnapshot() {
		return this.getSnapshot();
	}


	

}
