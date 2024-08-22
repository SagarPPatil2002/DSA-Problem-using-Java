/*
5	
4	9
3

*/

class Pattern40
{
 public static void main(String args[])
 {
  int n=5;
  int count=5;   //5,4,3
  for(int i=n;i>=1;i--)//5>=1//4>=1//3>=1
  {
   int c=count;  //5,10//4,9,14,//3
   for(int j=n;j>=i;j--) //5>=5,4>=5//5>=4,4>=4,3>=4//5>=3
   {
    System.out.print(c+"\t");
    c+=j;
}
   System.out.println();
   count--;
}
  
}
}