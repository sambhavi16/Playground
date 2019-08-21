#include<stdio.h>
int main()
{
  int n,i,s=6,k=4;
  scanf("%d",&n);
 int b[n];
  for(i=0;i<n;i++)
    if(i%2==0)
    {
      s=s+1;
      b[i]=s;
    }
  else
  {
    k=k+1;
    b[i]=k;
  }
  for(i=0;i<n;i++)
  { 
    printf("%d ",b[i]);
  }
    return 0;    
}