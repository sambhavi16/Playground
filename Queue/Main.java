#include<stdio.h>
int main()
{
  int n,m,count=0;
  scanf("%d%d",&n,&m);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  for(int i=0;i<n;i++)
  {
    if(arr[i]<m||(arr[i]+arr[i+1])<=m)
      count++;
  }
  printf("%d",count);
}