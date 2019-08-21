#include<stdio.h>
#include<string.h>
int main()
{
  char str[100],l,i,j,temp;
  scanf("%s",str);
  l=strlen(str);
  for(i=1;i<=l;i++)
  {
    for(j=0;j<l-i;j++)
    {
      if(str[j]>str[j+1])
      {
        temp=str[j];
        str[j]=str[j+1];
        str[j+1]=temp;
      }
    }
  }
    printf("The sorted string is %s",str);
}
