/*
11
12      7
13      8       4
14      9       5       2
15      10      6       3       1*/

class Pattern42
{
 public static void main(String args[])
 {
  int n=5;
   int count=((n*(n+1)/2)-n+1); //11,12
   for(int i=n;i>=1;i--) // 5>=1//4>=1
    {
          int c=count; //11,6//12,7
      for(int j=n;j>=i;j--) //5>=5,4>=5//5>=4,4>=4
      {
       System.out.print(c+"\t");
         c-=j;
}
         System.out.println();
         count++;
}
}
}