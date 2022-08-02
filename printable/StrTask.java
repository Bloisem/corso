package printable;

public class StrTask {
	private String myString;
	private StringBuilder myStringBuilder;

	public StrTask(StringBuilder myStringBuilder) {
		
		this.myStringBuilder = myStringBuilder;
	}

	public StrTask(String myString) {
		this.myString = myString;
	}

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}

	public void findEmail() {
		while (true)
			if (myString.indexOf('@') == -1) {
				break;
			} else {
				System.out.println(myString.substring(myString.indexOf('@') + 1, myString.indexOf('.')));
				myString = myString.substring(myString.indexOf('.') + 1, myString.length());
			}

	}
	public boolean equalsStringBuilder(StringBuilder a) {
		if(a.length()!=myStringBuilder.length()) {
			return false;
		}
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)!=myStringBuilder.charAt(i)) {
				return false;
			}
		}
		
		return true;
	}

}
