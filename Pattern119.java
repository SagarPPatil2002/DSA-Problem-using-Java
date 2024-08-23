/*
    E
   dEd
  CdEdC
 bCdEdCb
AbCdEdCbA
*/

class Pattern119
{
	public static void main(String args [])
	{
		int n=5;
	   for(int i=1;i<=n;i++) //1<=5
	     {
   		for(int j=i;j<n;j++) //1<=5
		System.out.print(" ");
		for(int j=n-i+1;j<=n;j++)//5<=5
		if(j%2==0)
		System.out.print((char)(j+96));
	     else
		System.out.print((char)(j+64));
	for(int j=n-1;j>=n-i+1;j--)//4>=5//4>4=//4<=3,3<=2
            if(j%2==0)
               System.out.print((char)(j+96));
             else
              System.out.print((char)(j+64));
       System.out.println();
}
}
}