package MediatorAndFactory;

public class MainFactory extends Factory {
	public MainFactory() {
        this.userFactory = new UserFactory();
        this.botFactory = new BotFactory();
    }
}
