/*
15	
13	14
10	11	12
6	7	8	9
*/


class Pattern38
{
  public static void main(String args[])
 {
 int n=5;
 int count =n*(n+1)/2;   //15,13,10,6
 for(int i=1;i<=n;i++)   //1<=5//2<=5//3<=5//4<=5
  {
     int c=count; //15,16//13,14//10,11,12,13//6,7,8,9,10
    for(int j=i;j>=1;j--) //1>=1,0>=1//2>=1,1>=1,0>=1//3>=1,2>=1,1>=1,0>=1//4>=1,3>=1,2>=1,1>=1,0>=1//
    {
     System.out.print(c+"\t");
      c++;
}
     System.out.println();
      count-=i+1  ;
}
}
}