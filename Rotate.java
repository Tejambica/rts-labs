import java.util.Scanner;
//import java.util.Arrays;

public class Rotate
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String str = sc.nextLine(); //sc.next() for just one word
		int len = str.length();
		
		System.out.println("Enter your input:");
		int n = sc.nextInt();
		char[] rstr = new char[len]; //new char array
		
		System.out.println(str.charAt(2));
		
		for(int i =0; i<len;i++)
		{
			int index = (i+n)%len; //For rotating the char
			rstr[index] = str.charAt(i);				
		}
		System.out.println("Rotated string is: "+ String.valueOf(rstr)); 
	}
}