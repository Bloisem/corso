package alishev.day13_social;

public class SocialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User userMario = new User ("Mario");
		User userMarco = new User ("Marco");
		User userMatteo = new User ("Matteo");
		User userMaria = new User ("Maria");
		User userElena = new User ("Elena");
		
		userMario.subscribe(userElena);
		userMario.subscribe(userMaria);
		userMario.subscribe(userMatteo);
		userMario.subscribe(userMarco);
		userMaria.subscribe(userElena);
		userMaria.subscribe(userMario);
		System.out.println(userMario.isFriend(userMaria));
		userMario.sendMessage(userElena, "hello, how are you? ");
		userElena.sendMessage(userMario, "I'm fine, thanks and you? ");
		userMaria.sendMessage(userElena, "ciao, come va?");
		userElena.sendMessage(userMaria, "ciao bene, tu come te la passi?");
		userMaria.sendMessage(userElena, "bene grazie, quando ci vediamo?");
		userElena.sendMessage(userMaria, "stasera");
		userElena.sendMessage(userMaria, "verso le 20:00");
		System.out.println(MessageDataBase.getMessages());
		MessageDataBase.showDialog(userMaria, userElena);
	}

}
