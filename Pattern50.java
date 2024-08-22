/*
11      12      13      14      15
7       8       9       10
4       5       6
2       3
1
*/

class Pattern50
{
 public static void main(String args [])
 {
  int n=5;
  int count=1;//1,2
  for(int i=1;i<=n;i++)//1<=5//2<=5
   {
     int c=count;//1,6,10,13,15,16//2
      for(int j=n;j>=i;j--)//5>=1,4>=1,3>=1,2>=1,1>=1,0>=1//5>=2
       {
         System.out.print(c+"\t");
         c+=j;
}
          System.out.println();
             count++;
}     
}
}