import java.util.*;
public class Aprgm3{
public static void main(String args[]){
 	Scanner s=new Scanner(System.in);
	int i=0;
	System.out.println("Enter size of the array");
 	int n=s.nextInt();
	 int[] array=new int[n];
	System.out.println("Enter array elements");
	 for(i=0;i<n;i++)
  		{
			array[i]=s.nextInt();
 		 }
 	System.out.println("Enter search element");
 	int cck=s.nextInt();
 	boolean state=false;
 		for(i=0;i<array.length;i++)
 			{ 
   			 if(array[i]==cck)
     				 {
        				state=true;
					break;
     				 }
                          }
	if(state==true){
 			System.out.println("Search Element is "+ array[i]+" "+i);
		}
	else{
  			System.out.println("-1");
           }
   
      			
            }
}