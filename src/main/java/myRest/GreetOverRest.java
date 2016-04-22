package myRest; 

public class GreetOverRest {
	
	private final long id; 
	private final String content; 

	public GreetOverRest(long id, String content) {
		this.id = id; 
		this.content = content; 
	}

	public long getId() {
		return this.id; 
	}
	public String getContent() {
		return this.content;
	}
	
}