package shine.designPattern.designPattern.creational.builder;

public class CandidateBuilder {
	
	private String name;
	private  int candidateId;
	private  String domain;
	
	public CandidateBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public CandidateBuilder setId(int candidateId) {
		this.candidateId = candidateId;
		return this;
	}
	
	public CandidateBuilder setDomain(String domain) {
		this.domain = domain;
		return this;
	}
	
	public Candidate build() {
		return new Candidate(name, candidateId, domain);
	}

}
