#include<stdio.h>
int main()
{
  int n,c,arr[100],d,t;
  scanf("%d",&n);
  for(c=0;c<n;c++)
    scanf("%d",&arr[c]);
  for(c=0;c<n-1;c++)
  {
    for(d=0;d<n-c-1;d++)
    {
      if(arr[d]>arr[d+1])
      {
      t=arr[d];
      arr[d]=arr[d+1];
      arr[d+1]=t;
      }
    }
  }
  printf("Sorted array is:\n");
    for(c=0;c<n;c++)
      printf("%d\n",arr[c]);
    return 0;
}