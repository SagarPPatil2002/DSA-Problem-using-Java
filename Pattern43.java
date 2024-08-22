/*
1
6       2
10      7       3
13      11      8       4
15      14      12      9       5
*/

class Pattern43
{
  public static void main(String args[])
  {
   int n=5;
    int count=1; //1,6,10
     for(int i=n;i>=1;i--) //5>=1//4>=1//3>=1
     {
           int c=count; //1,//6,2//10,7,3
       for(int j=i;j<=n;j++) //5<=5//4<=5,5<=5//3<=5,4<=5,5<=5
          {
           System.out.print(c+"\t");
              c-=j;
          
}
           System.out.println();
           count+=i;
}
}
}
