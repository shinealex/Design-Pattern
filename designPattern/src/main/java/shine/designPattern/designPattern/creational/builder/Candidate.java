package shine.designPattern.designPattern.creational.builder;

 public class Candidate {
	
	private final String name;
	private final int candidateId;
	private final String domain;
	
	public Candidate(String name, int candidateId, String domain) {
		this.name = name;
		this.candidateId = candidateId;
		this.domain = domain;
	}
	
	@Override
	public String toString() {
		return "Candidate Name : " + name + " Domain : " + domain + " Id :" + candidateId; 
	}
	
}
