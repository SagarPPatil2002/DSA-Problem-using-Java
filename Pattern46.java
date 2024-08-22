/*
1	2	3	4	5
6	4
*/

class Pattern46
{
  public static void main(String args[])
  {
    int n=5;
    int count=1;  //1,6
    for(int i=1;i<=n;i++) //5>=1//4>=1
    {
       for(int j=n;j>=i;j--) //1<=5,2<=5....5<=5,6<=5//1<=4,2<=4
         {
          System.out.print(count+"\t");
            count++;
}
           System.out.println();
            
}
    
}
}
