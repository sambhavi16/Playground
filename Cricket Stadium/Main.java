#include<stdio.h>
int main()
{
  int a,b,area,peri;
  scanf("%d%d",&a,&b);
  peri=2*(a+b);
  area=a*b;
  printf("%d\n%d\n",peri,area);
  return 0;
}