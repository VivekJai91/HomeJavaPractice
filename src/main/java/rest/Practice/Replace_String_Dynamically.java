package rest.Practice;

public class Replace_String_Dynamically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String intial = "vi2ve#$$6799$%$&^%k";
		
	
		
		String text ="";
		String number ="";
		String character ="";
	
		
		//System.out.println(intial.length());
		
		for(int i=0; i<intial.length();i++)
		{
			
			char k =intial.charAt(i);
			
			if(Character.isAlphabetic(k))
				
			{
				text+=k;
			}
             
			else if(Character.isDigit(k))
			{
				number+=k;
		    }
			
			
			else
			{
				character+= k;
				
			}
			
			
			

		}
		
		System.out.println(text);
		System.out.println(number);
		System.out.println(character);

	}

}
