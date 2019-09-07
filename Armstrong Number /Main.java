#include <stdio.h>
#include<math.h>
int main() {
	int i,n,b,c=0,m,d=0;
  scanf("%d",&n);
  m=n;
  while(n>0){
    b=n%10;
    n/=10;
    d++;
    c+=pow(b,3);}
 // printf("%d",d);
  if(c==m)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
    //Type your code
	return 0;
}