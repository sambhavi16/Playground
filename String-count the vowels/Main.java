#include<stdio.h>
#include<string.h>
int main()
{
  char str[100],i;
  int c=0,l;
  scanf("%s",str);
  l=strlen(str);
  for(i=0;i<=l;i++)
  if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u')
  {
    c++;
}
  printf("Number of vowels: %d",c);
}