import java.util.*;
public class Aprgm6{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] array=new int[n];
	int i=0;
	int j=0;
	int temp=0;
	System.out.println("Enter the array Elements");
	for(i=0;i<n;i++)
	{
	    array[i]=s.nextInt();
	}
	
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++){
			if(array[i]>array[j])
		  {
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
                   
		  }
		}
	}
	for(i=0;i<n;i++){
	System.out.print(array[i]);
	}
   }
 }
	