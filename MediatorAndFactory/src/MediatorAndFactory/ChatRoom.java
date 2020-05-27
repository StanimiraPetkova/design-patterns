package MediatorAndFactory;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
	private static List<User> users = new ArrayList<User>();
    private static Bot bot;
    private static final MainFactory MAIN_FACTORY = new MainFactory();

    public ChatRoom() {
    }

    public static void message(User sender, User receiver, String message) {
        if (!users.contains(sender)) {
            System.out.println(sender.getName() + " is not in the room");
        } else {
            System.out.println(sender.getName() + " to " + receiver.getName() + ": " + message);
            if (bot != null && message.contains("cat")) {
                bot.removeUser(sender);
            }

            if (message.equals("addBot")) {
                bot = MAIN_FACTORY.yieldBot();
            }

        }
    }

    public static void join(User user) {
        if (user != null) {
            users.add(user);
            System.out.println(user.getName() + " is added");
        }

    }

    public static void remove(User user) {
        if (user != null && users.contains(user)) {
            users.remove(user);
            System.out.println(user.getName() + " is removed");
        }

    }
}
