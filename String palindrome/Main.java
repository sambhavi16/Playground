#include<stdio.h>
#include<string.h>
int main()
{
  char str[100];
  int len,i,flag;
  scanf("%d",&str);
  len=strlen(str);
  for(i=0;i<len;i++)
  {
   if(str[i]!=str[len-i-1])
   {
     flag=1;
     break;
   }
  }
    if(flag=0)
     printf("Not a palindrome");
    else 
      printf("Palindrome");
  }