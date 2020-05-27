package MediatorAndFactory;

public class Main {
	 public Main() {
	    }

	    public static void main(String[] args) {
	        Factory factory = new MainFactory();
	        User Rachel = factory.yieldUser("Rachel");
	        User Ross = factory.yieldUser("Ross");
	        User Monica = factory.yieldUser("Monica");
	        ChatRoom.join(Rachel);
	        ChatRoom.join(Ross);
	        ChatRoom.join(Monica);
	        Rachel.sendMessage(Ross, "Hey");
	        Ross.sendMessage(Rachel, "Hello");
	        Rachel.sendMessage(Ross, "Do you have a pet");
	        Monica.sendMessage(Rachel, "addBot");
	        Ross.sendMessage(Rachel, "Yes, I have a cat?");
	        Monica.sendMessage(Rachel, "Why you did it");
	        Ross.sendMessage(Rachel, "What");
	    }
}
