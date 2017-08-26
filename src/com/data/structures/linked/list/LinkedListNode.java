package com.data.structures.linked.list;

public class LinkedListNode<T> {

    LinkedListNode<T> next = null;
    T data;

    LinkedListNode(T d) {
        data = d;
    }

    public void appendToTail(T d) {
        LinkedListNode end = new LinkedListNode(d);
        LinkedListNode n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public void traverseList() {

        LinkedListNode n = this;

        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }

    }

    public void insertNode(int data, int position, LinkedListNode lnh) {
        LinkedListNode newNode = new LinkedListNode(data);

        LinkedListNode currentNode = lnh;

        int currentPosition = 0;

        while (currentPosition < position) {
            System.out.println("currentPosition" + currentPosition);
            currentNode = currentNode.next;
            currentPosition++;
        }
        LinkedListNode tempNode = currentNode;
        System.out.println(tempNode.data);
        currentNode.next = newNode;
        System.out.println(currentNode.next.data);
        currentNode.next.next = tempNode.next;
        // System.out.println(newNode.next.data);
    }
}
