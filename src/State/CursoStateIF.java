package State;

import java.util.List;

import model.Course.Snapshot;

public interface CursoStateIF {
	
	public CursoStateIF continuar();
	public CursoStateIF suspender();
	public CursoStateIF concluir();
	public CursoStateIF cancelar();
	public void restore(Snapshot snapshot);
	public double executar(List<Double> historico);


}
