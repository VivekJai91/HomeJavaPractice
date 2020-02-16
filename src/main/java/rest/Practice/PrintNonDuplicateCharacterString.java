package rest.Practice;

import java.util.HashMap;

public class PrintNonDuplicateCharacterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "sillyspider";
		char c;
		HashMap <Character,Integer> map = new HashMap<>();

	
	for(int i =0;i<str.length();i++)
	{
		c =str.charAt(i);
		
		if(map.containsKey(c))
		{
			map.put(c, map.get(c)+1);
		}
		else
		{
			map.put(c, 1);
		}
	}
	
	for(int j=0;j<str.length();j++)
	{
		c= str.charAt(j);
		
		if(map.get(c)==1)
		{
			System.out.println("Non duplicate character:"+c);
			
		}
	}
	}
}
