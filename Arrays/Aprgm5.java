import java.util.*;
public class Aprgm5{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] array=new int[n];
	int i=0;
	int j=0;
	int temp=0;
	System.out.println("Enter the array elemnts");
	for(i=0;i<n;i++)
	{
	    array[i]=s.nextInt();
	}
	
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n-1;j++){
			if(array[i]>array[j])
		  {
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
                   
		  }
		}
	}
	System.out.println("The Largest 2 numbers are "+array[n-2]+" and "+array[n-1]);
	System.out.println("The Smallest 2 numbers are "+array[0]+" and "+array[1]);
	
   }
 }
	