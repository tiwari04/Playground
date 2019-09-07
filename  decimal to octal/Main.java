#include<stdio.h>
int main()
{
  int n,i,c=0,a[120];
  scanf("%d",&n);
  while(n!=0){
    a[c++]=n%8;
    n/=8;
  }
  for(i=c-1;i>=0;i--)
    printf("%d",a[i]);//type your code here
  return 0;
}