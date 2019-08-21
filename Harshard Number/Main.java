#include<stdio.h>
int main()
{
  int n,x,sum=0;
  scanf("%d",&n);
  int tem = n;
  while(n!=0)
  {
    x=n%10;
    sum=sum+x;
    n=n/10;
  }
  if(tem%sum ==0)
   printf("Harshard Number");
  else 
    printf("Not Harshard Number");
  return 0;
}