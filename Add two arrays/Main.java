#include<stdio.h>
int main()
{
  int n,b[50],a[50],i,sum=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  for(i=0;i<n;i++)
    scanf("%d",&b[i]);
  for(i=0;i<n;i++)
  printf("%d ",a[i]+b[i]);
  return 0;
  
}