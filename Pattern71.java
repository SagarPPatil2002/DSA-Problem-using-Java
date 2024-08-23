/*
1
22
333
4444
55555
4444
333
22
1
*/

class Pattern71
{
 public static void main(String args[])
  {
   int n=5;
   for(int i=1;i<=(n*2)-1;i++)//1<=9
     {
       if(i<=n)//1<=5
          {
            for(int j=i;j>=1;j--)//1>=1
               System.out.print(i);
}
              else
               {
                  for(int j=i;j<=(n*2)-1;j++)
                      
                         System.out.print((n*2)-i);
                      }      
                         System.out.println();

}
}
}