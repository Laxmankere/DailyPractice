package upcasting;

public class Report {

	public static void main(String[] args) {
		Webdriver w = new Webdriver(); // object for super class
		w.App();
		w.App1();
		System.out.println("-----------------------------------------");
		
		Chrome c = new Chrome(); // object for Overriding Methods in subclass
		c.App();
		c.App1();
		c.App2();             // own method
		System.out.println("------------------------------------------");
		
		Webdriver w1 = new Chrome(); // Up-casting 
		w1.App();
		w1.App1();
		
	}

}
