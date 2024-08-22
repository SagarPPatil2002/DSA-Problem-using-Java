/*
11      12      13      14      15
7       8       9       10
4       5       6
2       3
1
*/

class Pattern49
{
 public static void main(String args [])
  {
    int n=5;
     int count=((n*(n+1)/2)-n+1);//11,7
         for(int i=n;i>=1;i--)//5>=1
          {
            int c=count;//11,12,13,14,15,16
            for(int j=i;j>=1;j--)//5>=1,4>=1,3>=1,2>=1,1>=1,0>=1
            {
             System.out.print(c+"\t");
              c++;
               }
              System.out.println();
              count-=i-1;
               } 

  
}
}