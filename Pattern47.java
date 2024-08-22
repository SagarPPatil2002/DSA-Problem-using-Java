/*
15      14      13      12      11
10      9       8       7
6       5       4
3       2
1
*/

class Pattern47
{
  public static void main(String args [])
  {
   int n=5;
   int count=(n*(n+1)/2); //15,10
   for(int i=n;i>=1;i--) //5>=1
      {
                for(int j=1;j<=i;j++) //5>=1,4>=1,3>=1,2>=1,1>=1,0>=1
          {
           System.out.print(count+"\t");
             count--;
          }
              System.out.println();
                }
}
}