package shine.designPattern.designPattern.structural.decorator;

public abstract class SpecialCandidateDecorator implements CandidateonBoard {
	
	private final CandidateonBoard decoratedCandidate;
	
	public SpecialCandidateDecorator(CandidateonBoard decoratedCandidate) {
		this.decoratedCandidate = decoratedCandidate;
	}

	@Override
	public String provideKit() {
		return decoratedCandidate.provideKit();
	}

	@Override
	public double joininggBonus(double StandardBonus) {
		return decoratedCandidate.joininggBonus(StandardBonus);
	}

}
