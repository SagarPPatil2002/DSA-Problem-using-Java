/*
5       9       12      14      15
4       7       9       10
3       5       6
2       3
1
*/

class Pattern51
{
 public static void main(String args [])
  {
   int n=5;
   int count=5; //5
   for(int i=n;i>=1;i--)//5>=1
   {
     int c=count;//5,9,
      for(int j=i;j>=1;j--)//5>=5,4>=1,3>=1,2>=1,1>=1
       {
         System.out.print(c+"\t");
         c+=j-1;
}
        System.out.println();
        count--;
}
}

}