#include<stdio.h>
int main()
{
  int r,c,a[100][100],i,j,sum=0;
  scanf("%d%d",&r,&c);
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      scanf("%d",&a[i][j]);
  for(i=0;i<r;i++)
  {
    sum=0;
    for(j=0;j<c;j++)
    {
      sum=sum+a[i][j];
    }
      printf("The sum of row %d: %d\n",i+1,sum);
  }
  return 0;
}