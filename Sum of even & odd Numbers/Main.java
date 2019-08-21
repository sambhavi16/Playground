#include<stdio.h>
int main()
{
  int n,sume=0,sumo=0,e=0,o=0;
  while(1)
  {
    scanf("%d",&n);
    if(n==-1)
      break;
    else
    {
      if(n%2==0)
      {
        sume=sume+n;
        e++;
      }
      else
      {
        sumo=sumo+n;
        o++;
      }
    }
  }
  printf("%d\n",sume);
  printf("%d\n",sumo);
  printf("%0.2f\n",sume/(float)e);
  printf("%0.2f\n",sumo/(float)o);
}