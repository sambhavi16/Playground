#include<stdio.h>
int main()
{
  int n,n1=0,n2=1,nt,i;
  scanf("%d",&n);
  printf("Enter n value\n");
  for(i=1;i<=n;i++)
  {
    nt=n1+n2;
    printf("%d ",nt);
    n1=n2;
    n2=nt;
  }
  return 0;
}