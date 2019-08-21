#include<stdio.h>
int main()
{
  int n,t,x,rev=0;
  scanf("%d",&n);
  t=n;
  while(n!=0)
  {
    x=n%10;
    rev=rev*10+x;
      n=n/10;
  }
  if(t==rev)
  printf("Same");
  else
    printf("Not Same");
  return 0;
}