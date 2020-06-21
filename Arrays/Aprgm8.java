public class Aprgm8
{
  public static void main(String[] args)
  {
    int[] array=new int[args.length];
   int sum=0;
   int cck6=0;
   int cck7=0;
    for(int i=0;i<args.length;i++)
     {
       array[i]=Integer.parseInt(args[i]);
       if(array[i]==6)
       cck6=i;   
       if(array[i]==7)
       cck7=i;
     } 
   if(cck7>cck6)
   {
    for(int i=0;i<array.length;i++)
     {
      if(i<cck6 || i>cck7)
       sum=sum+array[i];
     }
   }
 else
 {
  for(int i=0;i<array.length;i++)
    sum=sum+array[i];
  }
System.out.println(sum);
}
}