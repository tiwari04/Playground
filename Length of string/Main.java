#include<stdio.h>
#include<string.h>
int main()
{
  char str[50];
  int i;
  scanf("%[^\n]s",str);
 
  //for(i=0;str[i]!='\0';++i);
  i=strlen(str);
  printf("%d",i);//Type your code here
  return 0;
}