package Observer;

public class Main {

	public static void main(String[] args) {
		Trainee trainee = new Trainee();
		Trainer trainer = new Trainer(trainee);
		IObserver viewer1 = new Viewer();
		IObserver viewer2 = new Viewer();
		IObserver viewer3 = new Viewer();
		
		trainee.subscribe(viewer1);
		trainee.subscribe(viewer2);
		trainee.subscribe(viewer3);
		
		trainer.ChangeExercise("Up");
		System.out.println();
		trainer.ChangeExercise("Down");



	}
}
