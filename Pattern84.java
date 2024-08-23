/*
E
dE
CdE
bCdE
AbCdE
bCdE
CdE
dE
E
*/

class Pattern84
{
 public static void main(String args[])
  {
   int n=5;
  for(int i=n;i>=1;i--)
  {
   for(int j=i;j<=n;j++)
    {
      if(j%2==0)
         System.out.print((char)(j+96));
      else
       System.out.print((char)(j+64));
}
       System.out.println();
}

      for(int i=1;i<=n-1;i++)
        {
          for(int j=i+1;j<=n;j++)
         {
          if(j%2==0)
              System.out.print((char)(j+96));
          else
            System.out.print((char)(j+64));
}
          System.out.println();
}
}
}