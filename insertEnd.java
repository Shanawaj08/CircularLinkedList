/*Inserting Node at the end of the circular linked list
Given a circular linked list, Your task is to insert a node at the end of the list with given node value.*/

import java.util.*;
public class Main
{
    Node head, tail;
    static int size;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void createCircularList(int data) {
        Node newNode = new Node(data);
        
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            size++;
            return;
        }
        else {
            tail.next = newNode;
            tail = newNode;
            newNode.next = head;
            size++;
        }
    }
    public void insertEnd(int endval) {
        Node temp = head;
        Node endNode = new Node(endval);
        while(temp.next != head) {
            temp = temp.next;
        }
        temp.next = endNode;
        endNode.next = head;
    }
    public void display() {
        Node temp = head;
        do {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        while(temp != head);
    }
    
	public static void main(String[] args) {
		Main mn = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
		    int val = sc.nextInt();
		    mn.createCircularList(val);
		}
		int end = sc.nextInt();
		mn.display();
		mn.insertEnd(end);
		System.out.println();
		mn.display();
	}
}
