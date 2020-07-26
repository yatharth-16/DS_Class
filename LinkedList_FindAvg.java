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
public class LinkedList_FindAvg {

	
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
	
	public static void CalculateAvg(Node<Integer> head)
	{
		
		int sum=0,count=0;
		
		while(head!=null)
		{
			sum=sum+head.data;
			head=head.next;
			count++;
		}
		
		int avg=(int)sum/count;
		
		System.out.println(avg);
		
	}
	
	public static void main(String[] args) {
		

		Node<Integer> head = takeInput();
		
		CalculateAvg(head);
	}

}
