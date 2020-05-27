package MediatorAndFactory;

public class BotFactory {
    public BotFactory() {
    }

    Bot yieldBot() {
        return new Bot();
    }
}
