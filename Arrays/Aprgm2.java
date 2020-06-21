public class Aprgm2{
public static void main(String args[]){
	int[] array=new int[args.length];
	for(int i=0;i<args.length;i++)
		{
		  array[i]=Integer.parseInt(args[i]);
		}
	int minimum=array[0];
	int maximum=array[0];
	for(int i=0;i<array.length;i++)
	{
	
	if(array[i]>maximum)
		{
			maximum=array[i];
		}
	if(array[i]<minimum)
		{
			minimum=array[i];
		}
	}
	
	System.out.println("Minimum array  "+minimum);
	System.out.println("Maximum array  "+maximum);
  }
}
	 