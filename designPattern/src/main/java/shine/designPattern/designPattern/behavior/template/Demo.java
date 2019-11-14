package shine.designPattern.designPattern.behavior.template;

public class Demo {

	public static void main(String[] args) {
		
		InterviewProcess pythonInterview = new PythonInterview();
		pythonInterview.doInterview();
		
		InterviewProcess javaInterview = new JavaInterview();
		javaInterview.doInterview();
		
	}

}
