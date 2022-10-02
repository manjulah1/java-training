package com.cognologix.solution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.cognologix.controllers.DoublyLinkedListEx;
import com.cognologix.entity.Node;

public class DoublyLLMain {

	public static void main(String[] args) throws Exception {

		DoublyLinkedListEx<Integer> doublyLinkedList = new DoublyLinkedListEx<>();

		List<Integer> list = new ArrayList<>();

		String filePath = "/home/manjula/eclipse-workspace/Collection_Question_10/src/com/cognologix/model/inputData.txt";
		try (FileReader fr = new FileReader(filePath)) {
		BufferedReader bf = new BufferedReader(fr);
		String line;
		while ((line = bf.readLine()) != null) {
			list.add(Integer.parseInt(line));
		}

		for (Integer num : list) {
			doublyLinkedList.push(num);
		}

		doublyLinkedList.printDLL();

		System.out.println("Delete front node");
		Node<Integer> deletedFrontNode = doublyLinkedList.unshift();
		System.out.println(deletedFrontNode);

		doublyLinkedList.printDLL();

		System.out.println("Delete last node");
		Node<Integer> deletedLastNode = doublyLinkedList.pop();
		System.out.println(deletedLastNode);

		doublyLinkedList.printDLL();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
