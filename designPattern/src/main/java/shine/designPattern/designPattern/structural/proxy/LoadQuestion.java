package shine.designPattern.designPattern.structural.proxy;

public class LoadQuestion implements RoboticInterview {
	
	private final String question;
	
	public LoadQuestion(String question) {
		this.question = question;
	}

	@Override
	public void askQuestion() {
		printQuestion();
	}

	@Override
	public void printQuestion() {
		System.out.println("Question is : " + question + "?");
	}
}
