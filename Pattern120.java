/*
*********
 *******
  *****
   ***
    *
*/

class Pattern120
{
 public static void main(String args [])
 {
   int n=5;
    for(int i=1;i<=n;i++)//1<=5
       {
        for(int j=i;j>1;j--)//1>1
           System.out.print(" ");
        for(int j=1;j<=(n*2)-1;j++)//1<=9,2<=9,3<=9,4<=9,5<=9,6<=9,7<=9,8<=9,9<=9
           System.out.print("*");
 
          System.out.println();
}

}
}