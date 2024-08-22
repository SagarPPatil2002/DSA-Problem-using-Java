/*
1
2	6
3	7	10
4	8	11	13


*/

class Pattern36
{
  public static void main(String args[])
   {
    int n=5;
    int count = 1;//1,2,3,4
    for(int i=5;i>=1;i--) //5>=1,4>=1,3>=1,2>=1
     {
       int c=count;//1,4,,2,,2+5-1=6,9,,3,7,10,12,,4,8,11,13
       for(int j=n;j>=i;j--)//5>=5,0>=5//5>=4,4>=4,3>=4//5>=3,4>=3,3>=3,2>=3//5>=2,4>=2,3>=2,2>=2
       {
         System.out.print(c+"\t");
         c+=j-1;
}
        System.out.println();
         count++;
}
}
}