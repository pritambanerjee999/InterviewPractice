package com.data.structures.binary.search.tree;

public class BSTDemo {
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree(10);
		bst.insertNode(15);
		bst.insertNode(16);
		bst.insertNode(11);
		bst.insertNode(9);
		bst.insertNode(7);
		bst.insertNode(17);
		
		bst.traverseTree(bst.root);
		
	}
}
