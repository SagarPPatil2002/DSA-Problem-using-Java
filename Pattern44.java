/*
5
9       4
12      8       3
14      11      7       2
15      13      10      6       1
*/

class Pattern44
{
 public static void main(String args[])
 {
  int n=5;
  int count =5; //5,9
  for(int i=n;i>=1;i--) //5>=1//4>=1
    {
       int c=count; //5//9
      for(int j=i;j<=n;j++) //5<=5//5<=4
         {
            System.out.print(c+"\t");
             c-=j+1;
}
             System.out.println();
               count+=i-1;
}
}
}