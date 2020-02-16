package rest.Practice;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String str ="vivek is a bad boy";
		
		String character = "" ;

		String duplicate = "";
		
	

		

		for(int i=0; i<str.length();i++)
		{
			String current = Character.toString(str.charAt(i));

		if(character.contains(current))
		{
			if(!duplicate.contains(current))
			{

		duplicate+= current +",";

		}
		}
          character+=current;
		
		}

		System.out.println(duplicate);
		
}
}


