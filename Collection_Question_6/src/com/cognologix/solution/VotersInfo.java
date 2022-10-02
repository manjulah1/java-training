package com.cognologix.solution;

import java.util.List;
import java.util.Map;
import com.cognologix.operations.CandidateOperations;

public class VotersInfo {

	public static void main(String[] args) {
		String[] candidateInputData = { "22, Ravi Pawar, Aundh, 1603",
										"23, Suvarna Kale, Baner, 803",
										"27, Vinod Chavan, Aundh, 809", 
										"29, Vasant Mahajan, Aundh, 617", 
										"32, Aarti Patil, Baner, 351",
										"34, Swaran Bijur, Baner, 352" };

		CandidateOperations candidateOperations = new CandidateOperations(candidateInputData);
		// add candidates data
		candidateOperations.addCandidates();

		// get constituencies
		final List<String> constituencyList = candidateOperations.getConstitutiencies();

		// find the id of candidate with highest votes in each constituency
		final Map<String, Integer> responseMap = candidateOperations.calcIdForHighestVotes(constituencyList);

		System.out.println("Candidate Id for highest votes is: " + responseMap);
	}

}
