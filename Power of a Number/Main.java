#include <stdio.h>
#include<math.h>
int main()
{
  	int a,b,c;
  scanf("%d%d",&a,&b);
  if(b<0)
    printf("Wrong input");
  else{
    c=pow(a,b);
    printf("%d",c);}
  //Your code here       
    return 0;
}