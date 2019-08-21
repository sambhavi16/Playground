#include<stdio.h>
int main()
{
 int a,b,sum=0,val=0,i;
  scanf("%d%d",&a,&b);
  for(i=1;i<=a;i++)
  {
    if(a%i==0)
    {
      sum=sum+i;
    }
  }
  for(i=1;i<=b;i++)
  {
    if(b%i==0)
    {
      val=val+i;
    }
  }
  if(sum/a==val/b)
    printf("Friendly Pair");
  else 
    printf("Not Friendly Pair");
  return 0;
}