#include <stdio.h>
int main() {
	char c;
  scanf("%c",&c);
  if(c>='a'&&c<='z')
    printf("%c",c-32);
  else
    printf("%c",c+32);// Type your code here
	return 0;
}