public class Aprgm1{
public static void main(String args[]){
	int[] array=new int[]{4,2,5,3,1};
	
	int avg=0;
	int sum=0;
	int nn=array.length;
	for(int i=0;i<args.length;i++)
		{
		   array[i]=Integer.parseInt(args[i]);
		}
	for(int i=0;i<nn;i++)
	{
		sum=sum+array[i];
		avg=sum/nn;
	}
	System.out.println("Sum  "+sum);
	System.out.println("Average  "+avg);
	}
}
		