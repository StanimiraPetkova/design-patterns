package stateObserverChain;
public class Employee implements Observable {
    private State state;
    private Observer observer;
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Observer observer) {
        observer.setEmployee(this);
        observer.setState(new PrepareState());
        this.state = new PrepareState();
        this.observer = observer;
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.state = new PendingState();
    }

    @Override
    public void notifyObservers() {
        observer.update();
    }

    @Override
    public State getUpdate() {
        return state;
    }
}
