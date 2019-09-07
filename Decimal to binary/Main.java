#include<stdio.h>
int main()
{
  int n,i,c=0,a[150];
  scanf("%d",&n);
  while(n!=0){
    a[c++]=n%2;
    n/=2;
  }
  for(i=c-1;i>=0;i--)
    printf("%d",a[i]);//Type your code here
  return 0;
}