/*
5
45
345
2345
12345
2345
345
45
5
*/
class Pattern79
{
  public static void main(String args[])
  {
   int n=5;
   for(int i=n;i>=1;i--)
      {
       for(int j=i;j<=n;j++)
        {
          System.out.print(j);
}
           System.out.println();
}
 
            for(int i=1;i<=n-1;i++)
             {
               for(int j=i+1;j<=n;j++)
                 {
                   System.out.print(j);
}
                      System.out.println();
}
}
}