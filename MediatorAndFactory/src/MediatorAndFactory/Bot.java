package MediatorAndFactory;

public class Bot {
	public Bot() {
    }

    public void removeUser(User user) {
        System.out.println("Info message from Bot: Cat is not allowed word!");
        ChatRoom.remove(user);
    }

}
