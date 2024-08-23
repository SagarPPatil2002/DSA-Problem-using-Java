/*
A
bb
CCC
dddd
EEEEE
dddd
CCC
bb
A
*/

class Pattern80
{
 public static void main(String args[])
 {
  int n=5;
  for(int i=1;i<=n;i++)
    {
     for(int j=i;j>=1;j--)
      {
        if(i%2==0)
         System.out.print((char)(i+96));
          else
             System.out.print((char)(i+64));
}
          System.out.println();
}

          for(int i=n-1;i>=1;i--)
           {
             for(int j=i;j>=1;j--)
              {
                if(i%2==0)
                     System.out.print((char)(i+96));
                else
                   System.out.print((char)(i+64));
}

                 System.out.println();
}
}
}