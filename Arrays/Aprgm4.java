import java.util.*;
public class Aprgm4{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the array size");
	int n=s.nextInt();
	int[] array=new int[n];
	int i=0;
	System.out.println("Enter the array elements");
	for(i=0;i<n;i++)
		{
			array[i]=s.nextInt();
		}
	for(i=0;i<n;i++)
		{
		System.out.println((char)(array[i]));
		}
	}
}