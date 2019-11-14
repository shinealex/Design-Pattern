package shine.designPattern.designPattern.structural.proxy;

public class Demo {

	public static void main(String[] args) {
		
		RoboticInterview interview = new LoadQuestionProxy(" (a+b)2 ?? ");
		interview.askQuestion(); //Load from Real implementation LoadQuestion 
		
		interview.askQuestion(); // From proxy !! 
	}

}
