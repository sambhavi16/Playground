#include<stdio.h>
#include<math.h>
int main()
{
int n,i,x;
  scanf("%d",&n);
  printf("Enter n value\n");
  for(i=1;i<=n;i++)
  {
    x=pow(i,i);
  printf("%d ",x);
  }
  return 0;
}