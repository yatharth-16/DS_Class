import java.util.Scanner;

public class CircularLinkedList {

	
	public static Node<Integer> head=null;
    public static Node<Integer> tail=null;
	
    
    public static Node<Integer> InsertAtBegining()
    {
    	Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> last=null;
		while(data!=-1)
		{
			Node<Integer> newNode = new Node<Integer>(data);
			
			if(head==null)
			{
				head= newNode;
				tail = newNode;
				last=newNode;
				
			}
			else
			{   
				
				head= newNode; 
				head.next=tail;
				tail=head;
			} 
			
			data = s.nextInt();
		}
		last.next=head;
		return head;
    }
    
    
	public static Node<Integer> InsertAtEnd()
	{
	
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
				tail.next=head;
			} 
			
			data = s.nextInt();
		}
		return head;
	}
	
	public static Node<Integer> deleteNode()
	{
	      if (head == null) 
                return null; 
		
		Node<Integer> curr=head;
		Node<Integer> prev= null;
		 while (curr.data != key) { 
                    if (curr.next == head) { 
                System.out.printf("Node not Found"); 
                       break; 
                } 
			prev=curr;
			curr = curr.next; 
			
			 if (curr.next == head) { 
                          head = null; 
                          return head; 
                        } 
			 
			 if (curr == head) { 
                        prev = head; 
                    while (prev.next != head) 
                    prev = prev.next; 
                    head = curr.next; 
                    prev.next = head; 
                      } 
			 else if (curr.next == head) { 
                       prev.next = head; 
                       }
			else { 
                        prev.next = curr.next; 
                         } 
                     return head; 
			 	 
			 
	       }
		
	}
	
	
	public static void  print(Node<Integer> head)
	{
		if(head==null)
		{
			return;
		}
		
		Node<Integer> tail = head;
		
		do
		{
			System.out.println(tail.data);
			tail=tail.next;
			
		}while(tail!=head);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		//Node<Integer> head = InsertAtEnd();
		
		Node<Integer> head = InsertAtBegining();
		
		print(head);
		
		
		
		

	}

}
