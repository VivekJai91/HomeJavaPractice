package rest.Practice;

public class ArrayBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={3,1,6,4,9,7};
		
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				int k =j+1;
				
				if(a[j]<a[k])// ascending order // Descending order a[j]<a[k]
				{
					temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
				
			}
		}
		for(int i=0 ; i<a.length;i++){
			System.out.print(a[i]);
		}
		

	}

}
