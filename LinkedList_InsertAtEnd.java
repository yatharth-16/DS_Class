import java.util.Scanner;

class Node<T> {

	
    T data;
    Node<T> next;
    
    Node(T data)
    {
 	   this.data=data;
 	   next=null;
    }
	

}
public class LinkedList_InsertAtEnd {
	
	public static void InsertAtEnd(Node<Integer> head,int data)
	{  
		Node<Integer> head1 = head;
		
		while(head.next!=null)
		{
			head=head.next;
		}
		Node<Integer> newNode = new Node<>(data);
		
		head.next=newNode;
		
		while(head1!=null)
		{   
			System.out.println(head1.data+" ");
			
			head1=head1.next;
		}
		
		
		
		
	}
	
	public static Node<Integer> takeInput()
	{
		Node<Integer> head = null,tail=null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data!=-1)
		{
			Node<Integer> newNode = new Node<Integer>(data);
			
			if(head==null)
			{
				head= newNode;
				tail = newNode;
			}
			else
			{	
				tail.next= newNode; 
				tail= newNode;
			} 
			
			data = s.nextInt();
		}
		return head;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Node<Integer> head= takeInput();
		
		System.out.println("Enter data you want to insert at end");
		
		int data = s.nextInt();
		
		InsertAtEnd(head,data);
		
		
	}
	
}
