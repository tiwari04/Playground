// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n1,n2,min,i,gcd;
  // Enter your code here 
  scanf("%d%d",&n1,&n2);
  min=(n1>n2)?n2:n1;
  for(i=1;i<=min;i++)
    if(n1%i==0&&n2%i==0)
      gcd=i;
  printf("%d",gcd);
   return 0;
}