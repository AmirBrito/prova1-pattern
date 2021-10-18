package builder;

import builder.Curso;



public abstract class cursoAbstractBuilder {
	
	protected Curso object;

	public cursoAbstractBuilder() {
		super();
		object = new Curso();
	}
	
	public Curso getCurso() {
		return object;
	}
	
	public abstract void buildNome();
	public abstract void buildCodigo();
	public abstract void buildDisciplina();
	public abstract void buildLivro();
	
}
