#include<stdio.h>
#include<string.h>
int isvowel(char a){
  if(a=='a' || a=='e' || a=='i' ||
		a=='o' || a=='u' || a=='A' ||
		a=='E' ||a=='I' || a=='O' ||
		a=='U')
    return  0;
  else 
    return 1;}
int main()
{
  char str[100],i;
  scanf("%[^\n]s", str);
  for(i=0;i<strlen(str);i++){
    if(isvowel(str[i]))
      printf("%c",str[i]);}
  //Type your code here
  
  return 0;
}