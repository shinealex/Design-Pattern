package shine.designPattern.designPattern.creational.builder;

public class Demo {

	public static void main(String[] args) {
		
		Candidate candidateShine = new CandidateBuilder().setName("Shine").setId(1)
				.setDomain("java").build();
		
		System.out.println(candidateShine.toString());
		
		Candidate candidateAlex = new CandidateBuilder().setName("alex").setId(2)
				.setDomain("HR").build();
		
		System.out.println(candidateAlex.toString());

	}

}
