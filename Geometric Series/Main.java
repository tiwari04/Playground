#include<stdio.h>
#include<math.h>
int main()
{
  int m,a;
  scanf("%d",&m);
  if(m%2==1)
    a=pow(2,m/2);
  else
    a=pow(3,(m/2)-1);
  printf("%d",a);//type your code here
  return 0;
}