/*Delete a node with given value in Circular list 
You are given a circular linked list. Your task is to delete the node with given node value.
If there are more then 1 node with given node value then delete the node which occurs first in the list. */

import java.util.*;
public class Main
{
    Node head, tail, head2;
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
        Node temp = head;
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
            tail.next = head;
            size ++;
        }
        
        
    }
    public void deleteSpecific(int del) {
        
        Node temp = head;
        Node prev = null;
        Node curr = null;
        if(head.data == del) {
            head = head.next;
            tail.next = head;
            return;
        }
        while(temp.next != head) {
            if(temp.next.data == del) {
                prev = temp;
                prev.next = temp.next.next;
                return;
            }
            curr = temp;
            temp = temp.next;
        }
        if(temp.data == del) {
            curr.next = head;
        }
        
        
    }
    public void display() {
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        while(temp != head);
        
    }
    
	public static void main(String[] args) {
		Main mn = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++) {
		    int val = sc.nextInt();
		    mn.createCircularList(val);
		}
	    int del = sc.nextInt();
	
		mn.display();
		mn.deleteSpecific(del);
		System.out.println();
		mn.display();
		
	
	}
}
