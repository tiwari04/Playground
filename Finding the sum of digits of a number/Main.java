#include <stdio.h>
int main() {
	int a,b,c,s=0;
  scanf("%d",&a);
  while(a>0){
    b=a%10;
    s+=b;
    a=a/10;}
  printf("%d",s);//Type your code
	return 0;
}