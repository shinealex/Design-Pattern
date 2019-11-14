package shine.designPattern.designPattern.structural.proxy;

import java.util.Objects;

public class LoadQuestionProxy implements RoboticInterview{
	
	private LoadQuestion loadQuestion;
	private final String question;
	
	public LoadQuestionProxy(String question) {
		this.question = question;
	}

	@Override
	public void askQuestion() {
		if (Objects.isNull(loadQuestion))
			loadQuestion = new LoadQuestion(question);
		
		loadQuestion.printQuestion();
	}

	@Override
	public void printQuestion() {
		System.out.println("Question is : " + question + "?");
	}
	
	

}
