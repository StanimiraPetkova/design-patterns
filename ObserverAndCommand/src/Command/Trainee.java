package Command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Trainee {
	private String exercise;
    private List<Viewer> viewers = new ArrayList<Viewer>();

    public Trainee() {
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
        Iterator<Viewer> v3 = this.viewers.iterator();

        while(v3.hasNext()) {
            Viewer viewer = (Viewer)v3.next();
            viewer.setExercise(this.exercise);
        }

    }

    public void subscribe(Viewer viewer) {
        this.viewers.add(viewer);
    }

}
