#include<stdio.h>
int main()
{
  int n,c=0,d=0;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
  for(int i=1;i<=n;i++)
  {
    if(a[i-1]%2==0)
      c++;
    else 
      d++;
  }
  printf("Odd: %d\nEven: %d",d,c);
    return 0;
}