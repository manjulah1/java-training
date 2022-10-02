package com.cognologix.operations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cognologix.entity.Candidate;
import com.cognologix.mapper.CandidateMapper;

public class CandidateOperations {

	private List<Candidate> candidateList = new ArrayList<>();
	private String[] candidateData;

	public CandidateOperations(String[] candidateData) {
		this.candidateData = candidateData;
	}

	public Map<String, Integer> calcIdForHighestVotes(List<String> constituencyList) {
		Map<String, Integer> map = new HashMap<>();
		Integer highest = 0;
		Candidate highestVotedCandidate = null;
		for (String constituency : constituencyList) {
			for (Candidate candidate : candidateList) {
				if (candidate.getConstituency().equalsIgnoreCase(constituency)) {
					if (candidate.getVotes() > highest) {
						highest = candidate.getVotes();
						highestVotedCandidate = candidate;
					}
				}
			}
			map.put(constituency, highestVotedCandidate.getCandidateId());
			highest = 0;
		}
		return map;
	}

	public List<String> getConstitutiencies() {
		List<String> list = new ArrayList<>();
		for (Candidate candidate : candidateList) {
			if (list.contains(candidate.getConstituency()) == false) {
				list.add(candidate.getConstituency());
			}
		}
		return list;
	}

	public void addCandidates() {
		for (String candidate : candidateData) {
			Candidate candidate2 = CandidateMapper.getCandidateMapped(candidate);
			candidateList.add(candidate2);
		}
	}
}
