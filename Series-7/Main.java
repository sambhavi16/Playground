#include<stdio.h>
int main()
{
 int n,a=10,b=5,i;
  scanf("%d",&n);
  int x[n];
  printf("Enter n value\n");
  printf("%d %d ",a,b);
  for(i=1;i<=n-2;i++)
  {
   if(i%2!=0)
   {
     a=a+50;
     x[i]=a;
     printf("%d ",x[i]);
   }
    else if(i%2==0)
    {
      b=b+10;
      x[i]=b;
      printf("%d ",x[i]);
    }
    }
    return 0;
  }