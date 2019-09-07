#include<stdio.h>
int main()
{
  int n,a=0,b=1,c,i;
  scanf("%d",&n);
  if(n==1)
    printf("0");
  else if(n==2)
    printf("0 1");
  else {
    printf("0 1 ");
    for(i=3;i<=n;i++){
      c=a+b;
      a=b;
      b=c;
      printf("%d ",c);}}
    //Type your code here
  return 0;
}