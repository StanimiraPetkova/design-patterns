package Observer;

public class Viewer implements IObserver {
	private String exercise;
	private IObservable trainee;
	
	public Viewer() {
	}

	@Override
	public void update() {
		if(exercise == null) {
			System.out.println("No exercise");
			return;
		}
		
		exercise = trainee.getUpdate();
		System.out.println("Viewer changed exercise to "+ this.exercise);
		
	}

	@Override
	public void setTrainee(IObservable trainee) {
		this.trainee = trainee;
	}
	
	public String getExercise() {
		return this.exercise;
	}

	public void setExercise(String exercise) {
		this.exercise = exercise;
	}

}
