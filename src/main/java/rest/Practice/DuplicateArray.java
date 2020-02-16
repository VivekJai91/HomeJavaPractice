package rest.Practice;

import java.util.HashSet;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] ={ 1,2,3,5,5,5,6,8,9,9,9,3,3};
	
		
		  
        HashSet<Integer> set = new HashSet<Integer>(); //using collections
  
        for(int array: a)
        {
           if(!set.add(array)) // Print duplicate element
            {
               System.out.println("the duplicate element is :" +array);
                 
            }
           /*if(set.add(array)) //Remove duplicate element
           {
               System.out.println("Unique Element is : "+array);
           }*/
            

	}
        

}
}
