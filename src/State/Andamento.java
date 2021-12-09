package State;

import java.util.ArrayList;
import java.util.List;

import State.Course;
import State.Course.Snapshot;

public class Andamento extends CursoAbstractState implements CursoStateIF{
	
	private static final CursoStateIF instance = new Andamento();
	
	
	
	@Override
	public CursoStateIF suspender() {
		System.out.println("Suspendendo...");
		return new Suspenso();
	}
	
	@Override
	public CursoStateIF concluir() {
		System.out.println("Concluindo...");
		return new Concluido();
	}
	
	public  CursoStateIF getInstance() {
		
		return instance;
	}
	
	
	@Override
	public void restore(Snapshot snapshot) {
		
		snapshot.restore();
		//this.notifyObserver("Get restore");
	}
	
	@Override
	public Snapshot getSnapshot() {
		return this.getSnapshot();
	}


}
