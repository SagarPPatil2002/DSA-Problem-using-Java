/*
    O
   MN
  JKL
 FGHI
ABCDE
*/

class Pattern61
{
 public static void main(String args [])
 {
  int n=5;
  int count=n*(n+1)/2; //15,13
   for(int i=1;i<=n;i++) //1<=5//2<=5
   {
       int c=count;  //15//13,
       for(int j=i;j<n;j++) //1<5,2<5,3<5,4<5,5<5//2<5,3<5,4<5,5<5
         {
          System.out.print(" ");
            }
           for(int j=i;j>=1;j--)//1>=1//2>=1,1>=1
              {
               System.out.print((char)(c+64));
               c++;
              }
               System.out.println();
                count-=i+1;
}
            
}
}