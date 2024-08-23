/*
EdCbA
dCbA
CbA
bA
A
bA
CbA
dCbA
EdCbA
*/

class Pattern91
{
 public static void main(String args[])
 {
  int n=5;
   for(int i=5;i>=1;i--)
    {
       for(int j=i;j>=1;j--)
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
                    for(int j=i;j>=1;j--)
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