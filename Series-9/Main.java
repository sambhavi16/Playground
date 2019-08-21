#include<stdio.h>
#include<math.h>
int main()
{
 int n,x,i;
  scanf("%d",&n);
  int b[n];
  printf("Enter n value");
  for(i=1;i<=n;i++)
  {
    if(i%2!=0)
    {
      b[i]=pow(i,3);
      printf("%d ",b[i]);
    }
  else 
  {
    b[i]=pow(i,2);
    printf("%d ",b[i]);
  }
  }
  return 0;
}