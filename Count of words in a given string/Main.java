#include<stdio.h>

int main()
{
  char str[50];
  int i,c=0;
  scanf("%[^\n]s",str);
  for(i=0;i<=strlen(str);i++){
    if(str[i]==' ')
      c++;}
  printf("%d",c+1);//Type your code here
  
}