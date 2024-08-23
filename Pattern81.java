/*
A
Ab
AbC
AbCd
AbCdE
AbCd
AbC
Ab
A
*/

class Pattern81
{
 public static void main(String args[])
 {
  int n=5;
  for(int i=1;i<=n;i++)
    {
     for(int j=1;j<=i;j++)
     {
        if(j%2==0)
           System.out.print((char)(j+96));
         else
            System.out.print((char)(j+64));
}
            System.out.println();
}

            for(int i=n-1;i>=1;i--)
            {
              for(int j=1;j<=i;j++)
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