package com.data.structures.linked.list;

public class LinkedListExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode n = new LinkedListNode(10);
		
		//added the nodes
		n.appendToTail(11);
		n.appendToTail(12);
		n.appendToTail(14);
		n.appendToTail(21);
		
		//traversed Node
		n.traverseList();
		
		//insert Node
	//	n.insertNode(55, 2);
		
		n.traverseList();
	}

}
