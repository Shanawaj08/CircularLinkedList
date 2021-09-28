/* Circular Linked List
You will be given N strings.You have to create a circular linked list and then insert the given strings into it.
After Insertion,  You have to traverse the complete circular linked list using a starting node.
You will be provided with a string denoting the starting node.*/

public class Main
{
    Node head, tail;
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
       
    }
    public void printFrom(String start) {
        Node temp = head;
        
        while(!temp.data.equals(start)) {
            temp = temp.next;
        }
        Node curr = temp;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while(!curr.data.equals(start));
        
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
		sc.nextLine();
		for(int i=0; i<n; i++) {
		    String val = sc.next();
		    mn.createCircularList(val);
		}
	    String start = sc.next();
	
		mn.display();
		System.out.println();
		mn.printFrom(start);
		
		
		
	}
}
