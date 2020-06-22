package stateObserverChain;

	public interface Observer {

	    void update();

	    void setEmployee(Observable observable);

	    void setState(State state);
	}

