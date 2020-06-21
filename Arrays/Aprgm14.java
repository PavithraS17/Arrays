public class Aprgm14{
public static void main(String args[]){
	int[][] array1=new int[3][3];
	int k=0;
	if(args.length==9){
	  for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++){
			array1[i][j]=Integer.parseInt(args[k]);
			k++;
		}
	}
	System.out.println("The given array is:");
	int max=array1[0][0];
	for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++){
			System.out.print(array1[i][j]+" ");
			 if(array1[i][j]>max)
				max=array1[i][j];
		}
		System.out.println();
	}
	System.out.println("The Biggest number in the array is "+max);
    }
else{
	System.out.println("please enter 9 integer numbers");
	}
  }
}

	