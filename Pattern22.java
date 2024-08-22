/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
*/


class Pattern22
{
  public static void main(String args[])
   {
     int n=5;
       for(int i=1;i<=n;i++)//1<=5//2<=5//3<=5//4<=5//5<=5//6<=5=false out of loop
          {
            for(int j=i;j>=1;j--)//1>=1,0>=1=false//2>=1,1>=1,0>=1=false//3>=1,2>=1,1>=1,0>=1=false//4>=1,3>=1,2>=1,1>=1,0>=1==false//5>=1,4>=1,3>=1,2>=1,1>=1,0>=1==false
             {
              System.out.print(j);

}
                System.out.println();
}
}
}