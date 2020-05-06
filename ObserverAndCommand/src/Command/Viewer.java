package Command;

public class Viewer {
	 private String exercise;

	    public Viewer() {
	    }

	    public void setExercise(String exercise) {
	        this.exercise = exercise;
	        System.out.println("Viewer changed exercise to " + this.exercise);
	    }
}
