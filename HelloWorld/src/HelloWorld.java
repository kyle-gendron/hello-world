import java.util.Date;

public class HelloWorld {
	
	public void greetUser(){
		System.out.println("Hello World.  I am waiting...  Goodbye.");
	}
	
	//kept the newer change
	public void givePreamble(){
		System.out.println("Hear ye HEAR ye: important announcement.");
	}

	public void giveDate(){
		System.out.println(new Date().toString());
	}
	
	public static void main(String[] args) {
		HelloWorld greetings = new HelloWorld();
		greetings.givePreamble();
		greetings.giveDate();
		greetings.greetUser();	

	}

}
