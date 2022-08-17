package alishev.day13_social;

import java.time.LocalDateTime;

public class Message {

	private String sender;
	private String receiver;
	private String message;
	private LocalDateTime date;

	public Message(String sender, String receiver, String message) {
		this.sender = sender;
		this.receiver = receiver;
		this.message = message;
		this.date = LocalDateTime.now();
	}

//getters
	public String getSender() {
		return sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public String getMessage() {
		return message;
	}

	public LocalDateTime getDate() {
		return date;
	}

	@Override
	public String toString() { // TODO Auto-generated method stub
		return "\nFROM: "+sender+"\nTO: "+receiver+ "\nON: "+date+" \n"+message;

	}

}
