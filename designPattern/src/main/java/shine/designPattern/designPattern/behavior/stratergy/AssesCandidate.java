package shine.designPattern.designPattern.behavior.stratergy;

/**
 * 
 * @author Shine
 * This client can Interview implementation dynamically (new implementation can be handled too without 
 * any code change). Strategy can be decided at run time.
 *
 */
public abstract class AssesCandidate {
	
	Interview inteview;
	
	public AssesCandidate(Interview interview) {
		this.inteview = interview;
	}
	
	public void DoInterview() {
		inteview.doInterview();
	}
	
	public void setInterviewType(Interview inteview) {
		this.inteview = inteview;
	}
	
}
