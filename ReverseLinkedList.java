//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class ReverseLinkedList
{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
        
        	int n = sc.nextInt();
        
            Node head = new Node(sc.nextInt());
            Node tail = head;
        
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
        
            Solution ob = new Solution();
            head = ob.reverseList(head);
            printList(head); 
            t--;
        }
    } 
} 
   
// } Driver Code Ends


//function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution
{
    //Function to reverse a linked list.
     Node reverseList(Node head) {
        
        Node newNode = null;

        for (Node trav = head, next = null; trav != null; trav = next) {
            
            Node node = new Node(trav.data);
            
            if (newNode == null)
                newNode = node;
            else {
                node.next = newNode;
                newNode = node;
            }
            
            next = trav.next;
            
            // Clears the orginal head and its linked nodes
            // so revesed linked list doesn't require additional space
            // so it uses the same space of orginal linked list
            trav.data = 0;
            trav.next = null;
        }
        
        // For testing of "Clears the orginal head and its linked nodes" functionality
        // for (Node trav = head; trav != null; trav = trav.next)
            // System.out.println("trav.data: " + trav.data);
        
        return newNode;
    }
}
