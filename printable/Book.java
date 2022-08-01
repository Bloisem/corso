package printable;

public class Book implements Printable {
	private String name;
	private String author;
	
	
	


	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	


	public Book() {
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}



	@Override
		public void print() {
			System.out.println("Print book: " +name +" "+ author );
		}
	
	public void printBook(Printable[] printable){
		System.out.println(this.name);
	}
		
	}
	


