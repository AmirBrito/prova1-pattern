package director;

import builder.Curso;
import builder.cursoAbstractBuilder;

public class cursoDirector {
	
	private cursoAbstractBuilder builder;

	public cursoDirector(cursoAbstractBuilder builder) {
		super();
		this.builder = builder;
	}
	
	public void constructCombo() {
		
		builder.buildCodigo();
		builder.buildNome();
		builder.buildDisciplina();
		builder.buildLivro();
		
	}
	
	public Curso getCombo() {
		return builder.getCurso();
	}

}
