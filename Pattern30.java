/*
    5
   44
  333
 2222
11111
*/ 

class Pattern30
{
  public static void main(String args [])
  {
   int n=5;
  for(int i=n;i>=1;i--)//5>=1,4>=1
     {
       for(int j=i;j>1;j--) //5>1,4>1,3>1.2>1,1!>1// 4>1,3>1,2>1,1!>1//
      {
      System.out.print(" ");
}
       for(int j=i;j<=n;j++)//5<=5,6<=5//4<=5,5<=5,6!<=5//
        {
          System.out.print(i);
}
          System.out.println();
}
}
}