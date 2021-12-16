package State;

import State.Course.Snapshot;

public interface Snap {
	
	public void restore(Snapshot snapshot);
	public Snapshot  getSnapshot(Course curso);

}
