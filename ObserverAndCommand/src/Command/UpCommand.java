package Command;

public class UpCommand implements Command {
	    private Trainee trainee;

	    public UpCommand(Trainee trainee) {
	        this.trainee = trainee;
	    }

	    public void execute() {
	        this.trainee.setExercise("Up");
	    }
	}

