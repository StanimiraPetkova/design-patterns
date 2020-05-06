package Command;

public class Main {
	public static void main(String[] args) {
		Trainer trainer = new Trainer();
		Trainee trainee = new Trainee();
		
		Viewer viewer1 = new Viewer();
		Viewer viewer2 = new Viewer();
		Viewer viewer3 = new Viewer();
		
		trainee.subscribe(viewer1);
		trainee.subscribe(viewer2);
		trainee.subscribe(viewer3);	
		
		Command changeExerciseToDown = new DownCommand(trainee);
		Command changeExerciseToUp = new UpCommand(trainee); 
		
		trainer.setCommand(changeExerciseToDown);
		trainer.changeExercise();
		
		trainer.setCommand(changeExerciseToUp);
		trainer.changeExercise(); 
		
	}

}
