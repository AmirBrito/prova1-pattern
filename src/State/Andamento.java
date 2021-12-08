package State;

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
	


}
