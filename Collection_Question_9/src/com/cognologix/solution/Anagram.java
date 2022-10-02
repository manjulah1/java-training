package com.cognologix.solution;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.cognologix.operations.AnagramOperations;

public class Anagram {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String givenString;
		System.out.println("Enter a string: ");
		givenString = sc.nextLine();
		givenString = givenString.toLowerCase();
		
		String[] candidateArray = { "enlists", "google", "inlets", "banana" };
		List<String> candidateList = Arrays.asList(candidateArray);
		
		AnagramOperations anagramOperations = new AnagramOperations(candidateList, givenString);
		
		//check is Anagram
		List<String> anagrams = anagramOperations.getAnagrams();
		System.out.println(anagrams);
	}
}
