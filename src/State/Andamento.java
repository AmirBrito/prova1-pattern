package State;

import java.util.ArrayList;
import java.util.List;

import State.Course;
import State.Course.Snapshot;

public class Andamento extends CursoAbstractState implements CursoStateIF{
	
	
		
	
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
	
	
	
	
	@Override
	public void restore(Snapshot snapshot) {
		
		snapshot.restore();
		
		
	}
	
	@Override
	public void getSnapshot(Course curso) {
		System.out.println("snap");
		curso.getSnapshot() ;
	}


}
