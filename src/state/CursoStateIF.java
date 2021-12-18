package state;

import java.util.List;

import state.Course;
import state.Course.Snapshot;

public interface CursoStateIF {
		
	public CursoStateIF continuar();
	public CursoStateIF suspender();
	public CursoStateIF concluir();
	public CursoStateIF cancelar();
	public void restore(Snapshot snapshot);
	public void  getSnapshot(Course curso);
	public void imprimirCertificado(Course curso);


}
