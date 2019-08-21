#include<stdio.h>
int main()
{
  int n,s,sum=0;
  scanf("%d %d",&n,&s);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  int f=(n-1);
  for(int i=0;i<f;i++)
    sum=sum+arr[i];
  if(sum>s)
    printf("NO");
  else
    printf("YES");
}