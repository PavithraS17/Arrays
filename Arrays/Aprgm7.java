import java.util.*;
public class Aprgm7
{
  public static void main(String[] args)
  {
   int[] array=new int[args.length];
   LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
   for(int i=0;i<args.length;i++)
   {
     array[i]=Integer.parseInt(args[i]);
     l.add(array[i]);
    }
  for(Integer x:l)
  {
    System.out.print(x+" ");
  }
}
}