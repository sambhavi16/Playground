#include<stdio.h>
int main()
{
  char str[100],i=0;
  int c=0;
  scanf("%s",str);
    while(str[i]!='\0')
    {
 c++;
      i++;
    }
    printf("The length of %s is %d",str,c);
}