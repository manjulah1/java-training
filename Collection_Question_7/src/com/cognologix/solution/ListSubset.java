package com.cognologix.solution;

import java.util.ArrayList;
import java.util.List;

import com.cognologix.controllers.SublistOperation;

public class ListSubset {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		int[] l1 = new int[] { 6, 7, 8, 9 };
		int[] l2 = new int[] { 1, 2, 3, 4 };
		
		SublistOperation sublistOperation = new SublistOperation();
		list1 = sublistOperation.addNumbersToList(l1);
		list2 = sublistOperation.addNumbersToList(l2);

		// check if list2 is a subset of list1
		String response = sublistOperation.checkSubList(list1, list2);
		// print the result
		System.out.println(response);
	}

}
