/*
    A
   bAb
  CbAbC
 dCbAbCd
EdCbAbCdE
*/

class Pattern117
{
 public static void main(String args[])
 {
  int n=5;
  for(int i=1;i<=n;i++)//1<=5
  {
    for(int j=i;j<n;j++)//1<5,2<5,3<5,4<5,5<5//2<5,3<5,4<5,5<5
         System.out.print(" ");
    for(int j=i;j>=1;j--) //1>=1,0>=1//2>=1,1>=1,0>=1
        if(j%2==0)
             System.out.print((char)(j+96));//b
         else
            System.out.print((char)(j+64));//A//A
     for(int j=2;j<=i;j++) //2<=1//2<=2,3<=2
             if(j%2==0)
             System.out.print((char)(j+96));//b
         else
            System.out.print((char)(j+64));
      System.out.println();
      
}
}
}