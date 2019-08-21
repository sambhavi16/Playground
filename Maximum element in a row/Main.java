#include<stdio.h>
int main()
{
  int i,j,a[100][100],r,c,max[100];
  scanf("%d%d",&r,&c);
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      scanf("%d",&a[i][j]);
   max[i]=a[0][0];
  for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
        if(a[i][j]>max[i])
          max[i]=a[i][j];
    }
    for(i=0;i<r;i++)
      printf("%d\n",max[i]);
  return 0;
}