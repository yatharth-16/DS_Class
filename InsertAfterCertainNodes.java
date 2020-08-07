
public class InsertAfterCertainNodes {
    
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
	
	public static Node<Integer> insert(Node<Integer> head, int data, int pos)
	{
			 Node<Integer> newNode= new Node<>(data);
			 int i=0;
			 Node<Integer> temp= head;
			 
			 if(pos==0)
			 {
				 newNode.next= head;
				 head= newNode;
				 return newNode; 
			 }
			 
			 while(i<pos-1)
			 {
				 temp=temp.next;
				 i++;
			 }
			 newNode.next= temp.next;
			 temp.next= newNode;
			 return head;	
			 
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();
		
		insert(head, 5, 1);
		
		
	}
  
}
