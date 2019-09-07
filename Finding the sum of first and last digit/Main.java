#include <stdio.h>
int main() {
	int a,b,c;
  scanf("%d",&a);
  c=a%10;
  while(a>0){
    b=a%10;
    a/=10;}
  printf("%d",b+c);//Type your code
	return 0;
}