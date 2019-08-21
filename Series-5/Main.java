#include<stdio.h>
int main()
{
  int n,a=2,i=2;
  scanf("%d",&n);
  for(i=2;i<=n+1;i++)
  {
     printf("%d ",a);
    a=((a+1)*2)-i;
  }
  return 0;
}