package com.cognologix.controllers;

import com.cognologix.entity.Node;

public class DoublyLinkedListEx<T> {

	private int size;
	private Node<T> head;
	private Node<T> tail;

	// add node at the end of list
	public void push(T data) {
		if (data == null) {
			return;
		}
		if (head == null) {
			head = new Node<T>(data);
			tail = new Node<T>(data);
		} else {
			Node<T> newNode = new Node<T>(data);
			Node<T> lastNode = getLastNode(head);
			lastNode.setNext(newNode);
			newNode.setPrevious(lastNode);
			tail = newNode;
		}
		size++;
	}

	public void shift(T data) {
		if (data == null) {
			return;
		}
		Node<T> newNode = new Node<T>(data);
		if (this.head != null) {
			this.head.setPrevious(newNode);
			newNode.setNext(this.head);
			this.head = newNode;
		} else {
			this.head = newNode;
		}
		size++;
	}

	public Node<T> pop() {
		if (head == null && tail == null) {
			return head;
		}
		Node<T> lastNode = getLastNode(this.head);
		this.tail = lastNode.getPrevious();
		return lastNode;

	}

	public Node<T> unshift() {
		if (head == null && tail == null) {
			return head;
		}

		Node<T> frontNode = this.head;
		head = frontNode.getNext();
		return frontNode;

	}

	public Node<T> getLastNode(Node<T> root2) {
		if (root2 != null) {
			Node<T> lastNode = root2;
			if (lastNode.getNext() != null) {
				return getLastNode(lastNode.getNext());
			} else {
				return lastNode;
			}
		}
		return null;
	}

	public void printDLL() {
		Node<T> temp = head;
		if (head == null) {
			System.out.println("List is empty!");
		}
		while (temp != null && temp != tail.getNext()) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

}
