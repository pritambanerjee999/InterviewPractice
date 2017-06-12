package com.expedia.interview.practice;

public class Node {
	Node next = null;
	int data;
	
	Node(int d){
		data = d;
	}
	
	public void appendToTail(int d){
		Node newNode = new Node(d);
		
		Node currentNode = this;
		
		while(currentNode.next != null){
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
		currentNode = currentNode.next;
	}

	
	public void traverseList(){
		Node root = this;
		
		while(root.next !=null){
			System.out.println(root.data);
			root = root.next;
		}
	}
}
