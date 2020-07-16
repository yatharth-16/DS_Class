
public class BubbleSort {
	
	
	public static void BubbleSortNormal(int a[])
	{
		int n = a.length;
		
		
		for(int i=0;i<n-1;i++)
		{   
			
			for(int j=0 ;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}

		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	
	

	public static void main(String[] args) {
		
		int a[] = {98,3,600,7,1,2};
		
		BubbleSortNormal(a);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	
	}

}
