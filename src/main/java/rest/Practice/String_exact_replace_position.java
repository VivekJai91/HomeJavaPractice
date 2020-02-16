package rest.Practice;

public class String_exact_replace_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


StringBuilder intial = new  StringBuilder ("vi2ve#$$6799$%$&^%k");
		

		
		
		
		
		for(int i=0; i<intial.length();i++)
		{
			
			char k =intial.charAt(i);
			
			
			if(!Character.isLetter(k))
			{
				intial.setCharAt(i, '@');
			}
			}
		
		System.out.println(intial);

	}

}
