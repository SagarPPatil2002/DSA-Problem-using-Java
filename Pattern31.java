/*
    1
   21
  321
 4321
54321

*/


class Pattern31
{
  public static void main(String args[])
   {
    int n=5;
    for(int i=1;i<=n;i++)//1<=5,2<=5,,3>=5//
     {
        for(int j=n;j>i;j--)//5>1,4>1,3>1,2>1,1!>1==false..//5>2,4>2,3>2,2!>2==false..//5>3,4>3,3!>3=false..//
             {         
              System.out.print(" ");
                }
        for(int j=i;j>=1;j--) //1>=1,0!>1,//2>=1,1>=1,0>=1//3>=1,2>=1,1>=1//
           {
            System.out.print(j);
               }
             System.out.println();
}
}
}