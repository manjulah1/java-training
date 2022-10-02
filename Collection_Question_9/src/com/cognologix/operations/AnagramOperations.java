package com.cognologix.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramOperations {
	private List<String> candidateList;
	private String str;

	public AnagramOperations(List<String> candidateList, String str) {
		this.candidateList = candidateList;
		this.str = str;
	}

	public List<String> getAnagrams() {
		List<String> anagrams = new ArrayList<>();
		char[] givenArray = str.toCharArray();
		Arrays.sort(givenArray);
		for (String candidate : candidateList) {
			char[] candidateArr = candidate.toCharArray();
			Arrays.sort(candidateArr);
			boolean isAnagram = Arrays.equals(givenArray, candidateArr);
			if(isAnagram) {
				anagrams.add(candidate);
			}
		}
		return anagrams;
	}

}
