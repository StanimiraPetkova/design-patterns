package stateObserverChain;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

public class Handler {
	 private Employee employee;
	    private Handler handler;

	    public Handler(Employee employee) {
	        this.employee = employee;
	    }

	    public void setHandler(Handler handler) {
	        this.handler = handler;
	    }

	    public Employee getEmployee() {
	        return employee;
	    }

	    public void setEmployee(Employee employee) {
	        this.employee = employee;
	    }

	    public Handler getHandler() {
	        return handler;
	    }
}
