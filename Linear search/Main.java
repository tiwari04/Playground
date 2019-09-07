#include<stdio.h>
int main()
{
  int n,a[30],x,i,m,flag=0;
  scanf("%d",&n);
  for(i=0;i<n;i++){
    scanf("%d",&a[i]);}
  scanf("%d",&x);
  for(i=0;i<n;i++){
    if(x==a[i]){
      flag=1;
      m=i+1;}
  }
  if(flag==1)
    printf("%d",m);
  else 
    printf("%d isn't present in the array.",x);//Type your code here
  return 0;
}