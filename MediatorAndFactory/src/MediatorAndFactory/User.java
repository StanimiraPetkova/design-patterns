package MediatorAndFactory;

public class User {
	   private String name;

	    public User(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return this.name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void sendMessage(User receiver, String message) {
	        ChatRoom.message(this, receiver, message);
	    }

}
