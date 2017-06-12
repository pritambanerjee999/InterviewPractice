package com.data.structures.binary.search.tree;

public class BinarySearchTree {
	public Node root;

	public BinarySearchTree(Integer data){
		root = new Node(data);
	}

	public void insertNode(Integer data){
		Node current = root;
		Node newNode = new Node(data);
		Node parent = null;
		while (true){
			if (data < current.data){
				parent = current;
				current = current.leftNode;
				if(current == null){
					parent.leftNode = newNode;
					return;
				}
			}else{
				parent = current;
				current = current.rightNode;
				if(current == null){
					parent.rightNode = newNode;
					return;
				}
			}
		}
	}


	public void insertNode2(int data){
		Node node = new Node(data);
		Node currentNode = root;
		Node parent;
		
		while(true){
			
			if (data < currentNode.data){
				parent = currentNode;
				currentNode = currentNode.leftNode;
				if(currentNode == null){
					parent.leftNode = node;
				}
			}
		}
		
		
		
	
	}
	
	public void traverseTree(Node root){

		if (root!=null){
			traverseTree(root.leftNode);
			System.out.println(root.data);
			traverseTree(root.rightNode);
		}

	}


}
