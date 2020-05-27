package MediatorAndFactory;

public abstract class Factory {
	 public UserFactory userFactory;
	    public BotFactory botFactory;

	    public Factory() {
	    }

	    public User yieldUser(String name) {
	        return this.userFactory.yieldUser(name);
	    }

	    public Bot yieldBot() {
	        return this.botFactory.yieldBot();
	    }
}
