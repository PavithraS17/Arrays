import java.util.*;
public class Aprgm10{
public static void main(String args[]){
	int[] array=new int[args.length];
	for(int i=0;i<args.length;i++){
		array[i]=Integer.parseInt(args[i]);
	}
  int[] array1=new int[array.length];
  int k=0;
  for(int i=0;i<array.length;i++){
	if((array[i]%2==0) || array[i]==0){
		array1[k]=array[i];
		k++;
		}
	}
  for(int i=0;i<array.length;i++){
	if(!(array[i]%2==0))
		{
			array1[k]=array[i];
			k++;
		}
	}
  for(int i=0;i<array1.length;i++){
	System.out.print(array1[i]+" ");
	}
   }	
	
}