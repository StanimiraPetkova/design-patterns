package Observer;

import java.util.ArrayList;
import java.util.List;

public class Trainee implements IObservable {

	private List<IObserver> observers = new ArrayList<IObserver>();
	private String exercise;

	public void setExercise(String exercise) {
		this.exercise = exercise;
		this.notifyObservers();
	}
	
	@Override
	public void notifyObservers() {
		for(IObserver observer: this.observers) {
			observer.update();
		}
		
	}
	@Override
	public String getUpdate() {
		return exercise;
	}

	@Override
	public void subscribe(IObserver observer) {
		observer.setTrainee(this);
		this.observers.add(observer);
		
	}

	@Override
	public void unsubscribe(IObserver observer) {
		this.observers.remove(observer);
	}
}
