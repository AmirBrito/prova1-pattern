package state;

public class Concluido extends CursoAbstractState implements CursoStateIF{
	
	
	public void imprimirCertificado(Course curso) {
		
		String certificado = "CERTIFICADO DE CONCLUSÃO\n";
		
		certificado += "Nome Curso: " + curso.getName() + "\n";
		certificado += "Code: " + curso.getCode() + "\n";
		certificado += "Price: " + curso.getPrice() + "\n";
		certificado += "CHTotal : " + curso.getCHTotal()+ "\n";
		certificado += "PctCumprido : " + curso.getPctCumprido() + "\n";
		
		System.out.println(certificado);
		
	}
	
	

}
