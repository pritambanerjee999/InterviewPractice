package com.expedia.interview.binary.search.tree;

public class BinarySearchTree {
	Node root;
	
	BinarySearchTree(int d){
		root = new Node(d);
	}
	
	public void insertNode(int data){
		Node newNode = new Node(data);
		Node currentNode = root;
		Node parent = null;
		while(true){
			parent = currentNode;
			if(data<parent.data){
				currentNode = currentNode.left;
				if(currentNode == null){
					currentNode = newNode;
					parent.left = currentNode;
					return;
				}
				
			}else if(data>parent.data){
				currentNode = currentNode.right;
				if(currentNode == null){
					currentNode = newNode;
					parent.right = currentNode;
					return;
				}
			}
		}
	}
	
	public void traverseBST(Node n){
		if(n != null){
			traverseBST(n.left);
			System.out.println(n.data);
			traverseBST(n.right);
		}
		
	}

}
