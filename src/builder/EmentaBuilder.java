package builder;

public class EmentaBuilder extends cursoAbstractBuilder {

	@Override
	public void buildNome() {
		object.setNome("Padroes Criacionais");
		
	}

	@Override
	public void buildCodigo() {
		object.setCodigo("234");
		
	}

	@Override
	public void buildDisciplina() {
		object.setDisciplina("Factory Method");
		
	}

	@Override
	public void buildLivro() {
		object.setLivro("Padroes de Projeto");
		
	}

}
