package shine.designPattern.designPattern.structural.decorator;

public class GoodCandidate extends SpecialCandidateDecorator {

	public GoodCandidate(CandidateonBoard decoratedCandidate) {
		super(decoratedCandidate);
	}
	
	@Override
	public String provideKit() {
		return super.provideKit() + " + Company Car";
	}

	@Override
	public double joininggBonus(double StandardBonus) {
		return super.joininggBonus(StandardBonus + 100);
	}

}
