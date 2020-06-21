import java.util.*;
public class Aprgm11{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter array size");
	int n=s.nextInt();
	int[] array=new int[n];
	int i=0;
	System.out.println("Enter the array elements");
	for(i=0;i<n;i++)
		{
			array[i]=s.nextInt();
		}
        boolean state=false;
	for(i=0;i<n;i++)
	{
		if(array[i]==1 || array[i]==4)
			{
				state=true;
			}
		else{
			state=false;
			break;
		}
	}
  if(state==true)
	{
		System.out.println("True");
	}
  else{
	System.out.println("False");
	}
  }
}