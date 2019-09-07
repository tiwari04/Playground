#include<stdio.h>
int main()
{
  int n1,n2,max,lcm,i;
  //Type your code here
  scanf("%d%d",&n1,&n2);
  max=(n1>n2)?n1:n2;
  for(i=n1*n2;i>=max;i--)
    if(i%n1==0&&i%n2==0)
      lcm=i;
  printf("%d",lcm);
  return 0;
}