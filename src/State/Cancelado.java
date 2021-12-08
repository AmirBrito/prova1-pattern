package State;

public class Cancelado extends CursoAbstractState implements CursoStateIF{
	
	private static final CursoStateIF instance = new Andamento();
	
	public  CursoStateIF getInstance() {
		
		return instance;
	}
	

}
