package alishev.day13_social;
import java.util.ArrayList;
public class MessageDataBase {
	private static ArrayList<Message> messages = new ArrayList<>();

	
	public static ArrayList<Message> getMessages(){
		return messages;
	}
public static void showDialog(User u1, User u2) {
	for(Message a:messages) {
		if(a.getSender().equals(u1.getUsername())&&a.getReceiver().equals(u2.getUsername())||a.getSender().equals(u2.getUsername())&&a.getReceiver().equals(u1.getUsername())){
			System.out.println(a.getSender()+": "+a.getMessage());
		}
	}
		
	}
public static void saveMessage(Message message) {
	messages.add(message);
}
public static void setMessages(ArrayList<Message> messages) {
	MessageDataBase.messages = messages;
}
}
