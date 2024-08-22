/*
A
B A
C B A
D C B A 
E D C B A 
*/
  class Pattern23
{
  public static void main(String args [])
  {
   int n=5;
    for(int i=1;i<=n;i++)
      {
         for(int j=i;j>=1;j--)
          {
             System.out.print((char)(j+64));
}
           System.out.println();
}
}
}