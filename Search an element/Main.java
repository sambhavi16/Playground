#include<stdio.h>
int main()
{
  int n,a[100],key,i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  scanf("%d",&key);
 for(i=0;i<=n;i++)
 {
    if(a[i]==key)
    {
      printf("%d is present in the array",key);
      break;
    }
 }
  if(i>n)
    printf("%d is not present in the array",key);
  return 0;
}
    