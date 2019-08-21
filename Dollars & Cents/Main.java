#include<stdio.h>
int main()
{
  int d1,c1,d2,c2;
  scanf("%d%d%d%d",&d1,&c1,&d2,&c2);
  printf("%d\n%d",d1+d2+(c1+c2)/100,(c1+c2)%100);
 
}