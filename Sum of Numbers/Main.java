#include<stdio.h>
int main()
{
 int n=0,sum=0;
  int b[100];
  do 
  {
    scanf("%d",&b[n]);
      sum=sum+b[n-1];
  }
  while(b[n++]!=-1);
    printf("%d",sum);
  return 0;
}