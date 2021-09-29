/* Exchange Nodes 
Given a circular linked list, Your task is to exchange first and last node.The task should be done with only one extra node, you can not declare more than one extra node.*/

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
    public void exchangeHeadTail() {
        Node temp = head;
        while(temp.next.next != head) {
            temp = temp.next;
        }
        temp.next.next = head.next;
        head.next = temp.next;
        temp.next = head;
        head = head.next;
        
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
	    
		mn.display();
		mn.exchangeHeadTail();
		System.out.println();
		mn.display();
		
	
	}
}

