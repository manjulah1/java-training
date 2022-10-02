package com.cognologix.operations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsogramOperations {
	public Boolean checkIsIsogram(String inputString) {
		String[] arr = inputString.split("");
		Set<String> set = new HashSet<>(Arrays.asList(arr));
		return inputString.length() == set.size();
	}

	public String userInput() {
		try(Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			return str;
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
