package rest.Practice;

public class Reverse_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse the sentence
		String a= "Java is good";
		String b="";
		
		String[] c= a.split(" ");
		
		
		 
	for(int i=c.length-1;i>=0;i--)
		{
			b=b + c[i] + " ";
		}
		
		
		
		
		System.out.println(b);
		
		
		
		
	

}
}
