package rest.Practice;

import java.util.HashMap;
import java.util.Set;

public class Duplicate_and_occurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String str = "W3SCCCHOOLSS";
		HashMap<Character, Integer> map = new HashMap<>();
		char[]a = str.toCharArray();
		for (char ch : a) {
			if (map.containsKey(ch)) {
				int val = map.get(ch);
				map.put(ch, val + 1);
			} else {
				map.put(ch, 1);
			}
		}
		Set<Character> set = map.keySet();
		
		for(Character s:set)
		{
			System.out.println("Duplicate word " +s+ " Occurence " +map.get(s)+ " Times");
		}
	}
*/
		String st ="this is a a java java program this";
		
		String word[]= st.split(" ");
		
		HashMap<String , Integer> hm = new HashMap<>();
		
		for (String s: word)
		{
			if(hm.containsKey(s))
{
	Integer val=hm.get(s);
	hm.put(s, val+1);
}
			else
			{
				hm.put(s, 1);
			}
		}
		
Set<String> sm	=hm.keySet();

for(String last: sm)
{
	if(hm.get(last)>1)
	{
		System.out.println("duplicate word is:" +last+ " the occurence is:" +hm.get(last)+ " times");
	}
}
}
}
