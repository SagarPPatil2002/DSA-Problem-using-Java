/*
5
44
333
2222
11111
2222
333
44
5
*/

class Pattern72
{
  public static void main(String args [])
  {
    int n=5;
    for(int i=1;i<=(n*2)-1;i++)//1<=9//2<=9
      {
          if(i<=n)//1<=5//2<=5
              {
                for(int j=i;j>=1;j--)//1>=1,0>=1//2>=1,1>=1
                     System.out.print(n-i+1);//5-1+1=5,5-2+1=1,5-2+1
}
                        else
                           {
                              for(int j=i;j<=(n*2)-1;j++)
                                     System.out.print(i-n+1);
}
                                       System.out.println();
}
 
}
 }