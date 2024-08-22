/*
15	
14	13
*/


class Pattern34
{
 public static void main(String args[])
  {
   int n=5;
   int count=(n*(n+1)/2);     // 5*5+1/2=30/2=15--14--13--12
   for(int i=5;i>=1;i--)  //5>=1//4>=1
    {
     for(int j=i;j<=n;j++)//5<=5,6>=5//4<=5,5<=5
      {
       System.out.print(count+"\t");
         count--;

 }
          System.out.println();
}
}
}