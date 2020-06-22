package stateObserverChain;
 import lombok.*;
@Getter
@Setter
@RequiredArgsConstructor
public class Order implements Observer {
    @NonNull
    private String id;
    private State state = new PendingState();
    private Observable observable;

    @Override
    public void update() {
        System.out.println("The state of the shipment is changed...");
        this.state = observable.getUpdate();
    }

    @Override
    public void setEmployee(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }
}