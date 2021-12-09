package State;

import State.Course;
import State.Course.Snapshot;

public class Suspenso extends CursoAbstractState implements CursoStateIF{
	
	private static final CursoStateIF instance = new Andamento();
	
	@Override
	public CursoStateIF continuar() {
		System.out.println("Continuando...");
		return new Andamento();
	}
	
	
	
	@Override
	public CursoStateIF cancelar() {
		System.out.println("Cancelando...");
		return new Cancelado();
	}
	
	public  CursoStateIF getInstance() {
		
		return instance;
	}
	
	@Override
	public Snapshot getSnapshot() {
		
		 return this.getSnapshot();
	}




}
