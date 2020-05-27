package MediatorAndFactory;

public class UserFactory {
	   public UserFactory() {
	    }

	    User yieldUser(String name) {
	        return new User(name);
	    }
}
