package com.data.structures.binary.search.tree;

public class Node {
	
	public Node leftNode;
	public Node rightNode;
	public Integer data;
	
	Node(Integer data){
		this.data = data;
		this.leftNode = null;
		this.rightNode = null;
	}
}
