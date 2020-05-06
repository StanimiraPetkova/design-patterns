package Observer;

public class Trainer {
	Trainee trainee;
	public Trainer(Trainee trainee)
	{
		this.trainee = trainee;
	}
	public void ChangeExercise(String newExercise)
	{
		this.trainee.setExercise(newExercise);
	}
}
