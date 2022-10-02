package com.cognologix.controllers;

import java.util.ArrayList;
import java.util.List;

public class SublistOperation {

	public String checkSubList(List<Integer> list1, List<Integer> list2) {
		if (list1.size() > list2.size()) {
			if (list1.containsAll(list2)) {
				return "List1 is a superlist of List2";
			} else {
				return "List1 is not a superlist of List2";
			}
		} else if (list1.size() < list2.size()) {
			if (list2.containsAll(list1)) {
				return "List2 is a superlist of List1";
			} else {
				return "List2 is not a superlist of List1";
			}
		} else if (list1.size() == list2.size()) {
			if (list1.containsAll(list2)) {
				return "List1 is equal to List2";
			} else {
				return "List1 is not equal to List2";
			}
		}
		return null;
	}

	public List<Integer> addNumbersToList(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		return list;
	}
}
