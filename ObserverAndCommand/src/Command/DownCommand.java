package Command;

public class DownCommand implements Command {

	private Trainee trainee;

    public DownCommand(Trainee trainee) {
        this.trainee = trainee;
    }

    public void execute() {
        this.trainee.setExercise("Down");
    }
}
