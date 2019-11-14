package shine.designPattern.designPattern.structural.decorator;

public class NormalCandidate implements CandidateonBoard {

	@Override
	public String provideKit() {
		return "Noramal Kit";
	}

	@Override
	public double joininggBonus(double StandardBonus) {
		return StandardBonus;
	}

}
