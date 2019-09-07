#include<stdio.h>
#include<math.h>
int main()
{
  int n,s=0,i=0,a;
  scanf("%d",&n);
  while(n!=0){
    a=n%2;
    s=s+a*pow(2,i);
    i++;
    n/=10;}
  printf("%d",s);//Type your code here
  return 0;
}