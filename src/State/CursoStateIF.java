package State;

import java.util.List;

import State.Course;
import State.Course.Snapshot;

public interface CursoStateIF {
		
	public CursoStateIF continuar();
	public CursoStateIF suspender();
	public CursoStateIF concluir();
	public CursoStateIF cancelar();
	public void restore(Snapshot snapshot);
	public void  getSnapshot(Course curso);
	public void imprimirCertificado(Course curso);


}
