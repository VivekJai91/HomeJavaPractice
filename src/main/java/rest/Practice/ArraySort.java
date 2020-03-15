package rest.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a={5,8,1,4,9};
		
		List<Integer> list= new ArrayList <>();
		
			for (int i: a)
			{
				list.add(i);
			}
			
		Collections.sort(list);
		
		System.out.println("The Ascending order is:");
		
		for (int j: list)
		{
			System.out.print(j );
		}
		
		System.out.println("\nThe Desending order is:");
		
		Collections.sort(list, Collections.reverseOrder());
		
		for(int k:list)
		{
			System.out.print(k);
		}
			
		
		

	}
	
	 int [] a= new int [] {2,1,3};     
     
	   int temp = 0;{
	   
      //Sort the array in ascending order    
      for (int i = 0; i < a.length; i++) {     
          for (int j = i+1; j < a.length; j++) {     
             if(a[i] >a[j]) // Ascending // descending if(a[i]<a[j])
             
             {    
                 temp = a[i];    
                 a[i] = a[j];    
                 a[j] = temp;    
             }     
          } 
          System.out.println(a[i]);  
      }    
      
        
     
}
}
