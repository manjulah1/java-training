package com.cognologix.entity;

public class Candidate {
	private Integer candidateId;
	private String candidateName;
	private String constituency;
	private Integer votes;
	
	
	public Candidate(Integer candidateId, String candidateName, String constituency, Integer votes) {
		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.constituency = constituency;
		this.votes = votes;
	}
	
	public Integer getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getConstituency() {
		return constituency;
	}
	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", candidateName=" + candidateName + ", constituency="
				+ constituency + ", votes=" + votes + "]";
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	public Integer getVotes() {
		return votes;
	}
	public void setVotes(Integer votes) {
		this.votes = votes;
	}
	
	
}
