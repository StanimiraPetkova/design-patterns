package Command;

public class Trainer {

	private Command command;
	 
	public Trainer() {
		
	}
	 public void setCommand(Command command) {
		 this.command = command;
	 }
	  public void changeExercise() {
		  System.out.println("Trainer change the exercise");
		  this.command.execute();
	  }
}
