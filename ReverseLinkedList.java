import java.util.Scanner;

public class ReverseLinkedList {
   
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
	
	public static Node<Integer> reverseR(Node<Integer> head)
	{
		if(head==null||head.next==null)
		{
			return head;
		}
		
		Node<Integer> finalHead=reverseR(head.next);
		Node<Integer> temp= finalHead;
		
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		temp.next=head;
		head.next=null;
		return finalHead;
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();
		
		reverseR(head);
		
		
	}
}
