/*
EdCbA
EdCb
EdC
Ed
E
Ed
EdC
EdCb
EdCbA
*/

class Pattern92
{
 public static void main(String args[])
{
  int n=5;
  for(int i=1;i<=n;i++)
  {
   for(int j=n;j>=i;j--)
    {
      if(j%2==0)
         System.out.print((char)(j+96));
      else
        System.out.print((char)(j+64));
}
        System.out.println();
}
        for(int i=2;i<=n;i++)
           {
              for(int j=n;j>n-i;j--)
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