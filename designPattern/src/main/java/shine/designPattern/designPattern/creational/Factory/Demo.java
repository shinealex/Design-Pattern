package shine.designPattern.designPattern.creational.Factory;

import java.util.function.Supplier;

public class Demo {

	public static void main(String[] args) {
		
		Supplier<InterviewFactory> interwiewFactory = InterviewFactory::new;
		
		interwiewFactory.get().getInterview("JAVAINTERVIEW").doInterview();
		
		interwiewFactory.get().getInterview("PYTHONINTERVIEW").doInterview();
		
	}

}
