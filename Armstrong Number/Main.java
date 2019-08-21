#include<stdio.h>
int main()
{
  int n,rem,x=0,t;
  scanf("%d",&n);
  t=n;
  while(n!=0)
  {
    rem=n%10;
    x=x+(rem*rem*rem);
    n=n/10;
  }
  if(t==x)
  {
  printf("Armstrong Number");
  }
  else
  {
    printf("Not Armstrong Number");
  }
return 0;
}