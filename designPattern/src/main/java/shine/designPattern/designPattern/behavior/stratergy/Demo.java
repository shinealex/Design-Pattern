package shine.designPattern.designPattern.behavior.stratergy;

public class Demo {

	public static void main(String[] args) {
		
		AssesCandidate candidate1 = new JavaCandidate();
		candidate1.DoInterview();
		
		//Dynamically Change the behavior in Run Time :-), It is great!!! (Please imagin, HR send the candidate wrongly to Java Panel :-))
		
		candidate1.setInterviewType(new PythonInterview());
		candidate1.DoInterview();
		
		AssesCandidate candidate2 = new PythonCandidate();
		candidate2.DoInterview();

	}

}
