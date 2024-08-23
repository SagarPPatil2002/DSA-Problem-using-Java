/*
----E
---ddd
--CCCCC
-bbbbbbb
AAAAAAAAA

*/

class Pattern115
{
  public static void main(String args [])
  {
   int n=5;
    for(int i=n;i>=1;i--)//5>=1//4>=1//3>=1//2>=1//1>=1
      {
        for(int j=i;j>1;j--)//5>1,4>1,3>1,2>1,1>1//4>1,3>1,2>1,1>1//3>1,2>1,1>1//2>1,1>1//1>=1
          System.out.print(" ");
        for(int j=i;j<=n;j++)//5<=5,6<=5!//4<=5,5<=5,6<=5//3<=5,4<=5,5<=5//2<=5,3<=5,4<=5,5<=5,6<=5!//1<=5,2<=5,3<=5,4<=5,5<=5
          if(i%2==0)
            System.out.print((char)(i+96));//d,d//b,b,b,b
          else
           System.out.print((char)(i+64));//E//C,C,C//A,A,A,A,A
        for(int j=i+1;j<=n;j++) //6<=n!//5<=5,6<=5//4<=5,5<=5,6<=5//3<=5,4<=5,5<=5,6<=5//2<=5,3<=5,4<=5,5<=5
          if(i%2==0)
              System.out.print((char)(i+96));//d//b,b,b
          else
              System.out.print((char)(i+64));//C,C//A,A,A,A
        System.out.println(); 
}
}
}
