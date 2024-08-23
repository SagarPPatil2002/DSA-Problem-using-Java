/*
----A
---bbb
--CCCCC
-ddddddd
EEEEEEEEE
*/

class Pattern114
{
 public static void main(String args [])
 {
 int n=5;
 for(int i=1;i<=n;i++)//1<=5//2<=5//3<=5//4<=5//5<=5
  {
   for(int j=i;j<n;j++)      //1<5,2<5,3<5,4<5,5<5//2<5,3<5,4<5,5<5//3<5,4<5//4<5,5<5//5>5
        System.out.print(" ");
  for(int j=i;j>=1;j--)       //1>=1//2>=1,1>=1//3>=1,2>=1,1>=1//4>=1,3>=1,2>=1,1>=1//5>=1,4<=5,3<=5,2<=5,1<=5
      if(i%2==0)
          System.out.print((char)(i+96));      //bb/d,d,d,d
       else
          System.out.print((char)(i+64));     //A/C,C,C/E,E,E,E,E
   for(int j=2;j<=i;j++)           //2<=1//2<=2,3<=2//2<=3,3<=3,4<=3//2<=4,3<=4,4<=4,5<=5//2<=5,3<=5,4<=5,5<=5
     if(i%2==0)
          System.out.print((char)(i+96));        //b/d,d,d
      else
        System.out.print((char)(i+64));         //C,C/E,E,E,E
   
     System.out.println();
}
}
}