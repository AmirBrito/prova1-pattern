package State;

public class Concluido extends CursoAbstractState implements CursoStateIF{
	
	private static final CursoStateIF instance = new Andamento();
	
	public void imprimirCertificado() {
		
	}
	
	public  CursoStateIF getInstance() {
		
		return instance;
	}

}
