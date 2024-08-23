/*
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
*/

class Pattern94
{
 public static void main(String args[])
 {
  int n=5;
  for(int i=1;i<=(n*2)-1;i++)//1<=9//2<=9//3<=9//4<=9//5<=9
   {
     if(i<=n)//1<=5//2<=5//3<=5//4<=5//5<=5
      {
         for(int j=i;j<n;j++)//1<5,2<5,3<5,4<5,5<5//2<5,3<5,4<5,5<5//3<5,4<5,5<5//4<5,5<5//5<5
                System.out.print(" ");
          for(int j=i;j>=1;j--)//1>=1,0>=1//2>=1,1>=1,0>=1//3>=1,2>=1,1>=1,0>=1//4>=1,3>=1,2>=1,1>=1,0>=1//
              System.out.print("*");
}
       else
        {
             for(int j=i;j>n;j--)
                        System.out.print(" ");
              for(int j=i;j<=(n*2)-1;j++)
                         System.out.print("*");
}
               System.out.println();
}
}
}