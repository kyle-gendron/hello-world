
public class HelloWorld {
	
	public void greetUser(){
		System.out.println("Hello World.  I am waiting.");
	}
	
	public void givePreamble(){
		System.out.println("Hear ye hear ye: important announcement.");
	}
	
	public static void main(String[] args) {
		HelloWorld greetings = new HelloWorld();
		greetings.givePreamble();
		greetings.greetUser();	

	}

}
