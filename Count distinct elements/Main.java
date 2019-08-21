#include<stdio.h>
int main()
{
 int n,c=0;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(a[i]==a[j])
        c++;
    }
  }
  printf("There are %d distinct elements in the array.",n-c);
}