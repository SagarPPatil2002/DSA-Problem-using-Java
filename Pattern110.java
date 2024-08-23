/*
    1
   121
  12321
 1234321
123454321
*/

class Pattern110
{
 public static void main(String args [])
 {
  int n=5;
  for(int i=1;i<=n;i++)//1<=5//2<=5
  {
   for(int j=i;j<n;j++)//1<5,2<5,3<5,4<5,5<5!//2<5,3<5,4<5,5<5
     System.out.print(" ");
  for(int j=1;j<=i;j++)//1<=1,2<=1!//1<=2,2<=2,3<=2!
    System.out.print(j);
  for(int j=i-1;j>=1;j--)//0>=1!//1>=1//
     System.out.print(j);
   System.out.println();
}
}
}