/**
 * Program Name : Encrypt.java
 * Purpose : to encrypt the given strings
 * Coder : Bonnie Jung, 0727574
 * Date : May 14, 2015
 */
import java.util.*;

public class Encrypt
{
	private static final int MAX_STRING_LENGTH = 100;
	
	public static void main(String[] args){
		Scanner myInput = new Scanner(System.in);
		int count = myInput.nextInt();
		myInput.nextLine();//flush the buffer
	  String s;
			
		 //validate the count to be; count>=1 and count <=10
			if(count<1 || count >10)
			{
				System.err.println("out of range. please put an integer more than 0, less than 11");
			}
			
			for(int i = 0; i<count ; ++i)
			{
				s = myInput.nextLine();
				if(s.length()<=MAX_STRING_LENGTH)
				{
					System.out.println(encryptString(s));
				}
			myInput.close();
		}
	}//end main
	
	private static String encryptString(String s)
	{
		String even="";
		String odd = "";
		String result = "";
		
		//encrypting
		for(int i = 0; i<s.length(); ++i)
		{
			if(i%2 == 0)
				even +=s.charAt(i);
			else
				odd +=s.charAt(i);
		}//end of for loop
		result+=even;
		result+=odd;
		return result;
	}
}//end class
