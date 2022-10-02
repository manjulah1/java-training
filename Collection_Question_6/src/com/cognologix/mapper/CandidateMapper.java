package com.cognologix.mapper;

import com.cognologix.entity.Candidate;

public class CandidateMapper {
	public static Candidate getCandidateMapped(String candidate) {
		try {
			String[] candidateArray = candidate.split(", ");
			Integer candidateId = Integer.parseInt(candidateArray[0]);
			String candidateName = candidateArray[1];
			String constituency = candidateArray[2];
			Integer votes = Integer.parseInt(candidateArray[3]);

			Candidate candidate1 = new Candidate(candidateId, candidateName, constituency, votes);
			return candidate1;
		} catch (NumberFormatException numberFormatException) {
			throw new RuntimeException(numberFormatException);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
