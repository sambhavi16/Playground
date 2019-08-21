#include<stdio.h>
int main()
{
  int n,i,x;
  scanf("%d",&n);
  printf("Enter n value\n");
  for(i=1;i<=n;i++)
  {
    x=(i*i)-1;
    printf("%d ",x);
  }
    return 0;
  
}