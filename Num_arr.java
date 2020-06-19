import java.util.Arrays;
import java.util.Scanner;

public class Num_arr
{
	public static void main(String[] args)
	{
		int length, num, above = 0, below = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the array");
		length = sc.nextInt();
		
		int[] arr = new int[length];
		
		System.out.println("Enter the array elements:");
		for(int i = 0; i<length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter a number:");
		num = sc.nextInt();
		
		for(int i = 0; i<length;i++)
		{
			if(arr[i]>num)
				above++; // To find the numbers above the given number.
			else if(arr[i]<num)
				below++; // To find the numbers below the given number. 
		}
		
		System.out.println("Above: "+above+" Below: "+below);
	}
}
