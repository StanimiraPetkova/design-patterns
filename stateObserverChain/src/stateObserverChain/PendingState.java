package stateObserverChain;

public class PendingState implements State {

    @Override
    public void changeState(Order order) {
        System.out.println("State is updated to: PENDING..");
        order.setState(this);
    }
}
