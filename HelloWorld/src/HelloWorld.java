
public class HelloWorld {
	
	public void greetUser(){
		System.out.println("Hello World.  I am waiting...  Goodbye.");
	}
	
	public void givePreamble(){
		System.out.println("Hear ye Hear ye: important announcement.");
	}
	
	public static void main(String[] args) {
		HelloWorld greetings = new HelloWorld();
		greetings.givePreamble();
		greetings.greetUser();	

	}

}
