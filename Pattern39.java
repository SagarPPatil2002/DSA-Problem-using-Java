/*
15
14      10
13      9       6
12      8       5       3
11      7       4       2       1
*/


class Pattern39
{
 public static void main(String args[])
{
  int n=5;
  int count =n*(n+1)/2;  //15,14//13
  for(int i=n;i>=1;i--)  //5>=1//4>=1//3>=1
  {
    int c=count; //15,9//14,10,7//13,9,
     for(int j=n;j>=i;j--) //5>=5,4>=5//5>=4,4>=4//5>=3,4>=3
      {
    System.out.print(c+"\t");
     c-=j-1;
     }
    System.out.println();
    count--;
}
}
}