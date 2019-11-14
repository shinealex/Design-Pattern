package shine.designPattern.designPattern.behavior.template;

public abstract class InterviewProcess {
	
	abstract void apptitudeTest();
	abstract void technicalRound();
	abstract void managmentRound();
	abstract void hrRound();
	
	public final void doInterview() {
		apptitudeTest();
		technicalRound();
		managmentRound();
		hrRound();
	}

}
