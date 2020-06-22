package stateObserverChain;

public interface Observable {
	void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyObservers();

    State getUpdate();
}
