import java.util.*;
public class Aprgm12{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int[] array1=new int[3];
	System.out.println("Enter first array element");
	for(int i=0;i<array1.length;i++)
		{
			array1[i]=s.nextInt();
		}
	int[] array2=new int[3];
	System.out.println("Enter second array element");
	for(int i=0;i<array2.length;i++)
		{
			array2[i]=s.nextInt();
		}
	int[] array3=new int[2];
	array3[0]=array1[1];
	array3[1]=array2[1];
	System.out.println("Middle elements");
	for(int i=0;i<array3.length;i++)
		{
			System.out.print(array3[i]+" ");
		}
	}
}