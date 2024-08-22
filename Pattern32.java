/*
    5
   54
  543
 5432
54321*/


class Pattern32
{
  public static void main(String args[])
  {
    int n=5;
     for(int i=n;i>=1;i--)//5>=1//4>=1
      {
       for(int j=i;j>1;j--)//5>1,4>1,3>1,2>1,1!>1=false..//4>1,3>1,2>1,1!>1=false..//
       {
         System.out.print(" ");
               }
          for(int j=n;j>=i;j--)//5>=5,4!>=5//5>=4,4>=4,3!>=4//
          {
           System.out.print(j);
             }
             System.out.println();
}
}
}