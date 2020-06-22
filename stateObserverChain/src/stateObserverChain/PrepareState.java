package stateObserverChain;


public class PrepareState implements State {

    @Override
    public void changeState(Order order) {
        System.out.println("State is updated to: PREPARE..");
        order.setState(this);
    }
}

