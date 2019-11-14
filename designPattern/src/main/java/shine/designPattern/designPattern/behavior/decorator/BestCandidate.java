package shine.designPattern.designPattern.behavior.decorator;

public class BestCandidate extends SpecialCandidateDecorator {

	public BestCandidate(CandidateonBoard decoratedCandidate) {
		super(decoratedCandidate);
	}
	
	@Override
	public String provideKit() {
		return super.provideKit() + " + Company Accomadation";
	}

	@Override
	public double joininggBonus(double StandardBonus) {
		return super.joininggBonus(StandardBonus + 1000);
	}

}
