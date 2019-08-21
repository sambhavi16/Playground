#include<stdio.h>
#include<string.h>
int main()
{
  char str[100];
  int y,i,j;
    scanf("%s",str);
  y=strlen(str);
  for(i=0;i<y;i++)
  {
    if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u')
    {
      for(j=i;j<y;j++)
      {
        str[j]=str[j+1];
    }
      y--;
    }
  }
   printf("%s",str);
}