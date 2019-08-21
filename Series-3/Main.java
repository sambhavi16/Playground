#include<stdio.h>
int main()
{
  int n,s=6,j=3;
  scanf("%d",&n);
  printf("Enter n value\n");
  printf("%d ",s);
  for(int i=1;i<n;i++)
  {
    s=s+j;
    j=j+2;
    printf("%d ",s);
  }
  return 0;
}