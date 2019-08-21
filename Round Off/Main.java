#include<stdio.h>
#include<math.h>
int main()
{
  int v;
  float val;
  float fval,cval;
  scanf("%f",&val);
  fval=floor(val);
  cval=ceil(val);
  v=((int)fval);
  printf("%d\n%0.1f\n%0.1f\n",v,cval,fval);
  return 0;
}