#include<stdio.h>
int main()
{
	int n,c=0;
  scanf("%d",&n);
  if(n%2==0){
    for(int i=1;i<n/2;i++)
      c+=1;}
  else
    for(int i=0;i<n/2;i++)
      c+=2;
  printf("%d",c);//type your code here
	
}