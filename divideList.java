/* Split Circular Linked List Into Two Equal halves 
Given a circular linked list, Your task is to divide the list into 2 equal halves */

import java.util.*;
public class Main
{
    Node head, tail, head2;
    static int size;
    static class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    public void createCircularList(String data) {
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null) {
            head = newNode;
            //tail = newNode;
            newNode.next = head;
            size++;
            return;
        }
        while(temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
        size ++;
    }
    public void divideList() {
        int n = size/2;
        int m = n+1;
        Node temp = head;
        while(temp != null && n>1) {
            
            temp = temp.next;
            n--;
        }
        Node curr = temp.next;
        temp.next = head;
        head2 = curr;
        
        while(curr != null && m<size) {
            curr = curr.next;
            m++;
        }
        curr.next = head2;
    }
    public void display() {
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        while(temp != head);
    }
    public void display2() {
        Node temp = head2;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        while(temp != head2);
    }
    
	public static void main(String[] args) {
		Main mn = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++) {
		    String val = sc.next();
		    mn.createCircularList(val);
		}
	    
	
		
		mn.divideList();
		mn.display();
		System.out.println();
		mn.display2();
		
		
		
		
		
		
	}
}
