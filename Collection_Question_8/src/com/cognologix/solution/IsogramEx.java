package com.cognologix.solution;

import com.cognologix.operations.IsogramOperations;

public class IsogramEx {
	public static void main(String[] args) {
		String inputString = null;

		IsogramOperations isogramOperations = new IsogramOperations();
		// take user input
		System.out.println("Enter the string:");
		inputString = isogramOperations.userInput();

		// check whether given input is an isogram
		Boolean isIsogram = isogramOperations.checkIsIsogram(inputString);
		if (isIsogram) {
			System.out.println("The given input string is an Isogram");
		} else {
			System.out.println("The given input string is not an Isogram");
		}
	}

}
