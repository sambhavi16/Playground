#include<stdio.h>
int main()
{
  //fill your code#include<iostream>
	int a,b;
	scanf("%d%d",&a,&b);
	int c=a*b;
	int x[20];
	x[0]=c;
	int i=0,count=0;
	while(c>1)
	{
		c=(a-i)+(b-i)-2;
		x[i+1]=c;
		count++;
		i++;
	}
	/*cout<<count<<endl;
	for(int i=0;i<=count;i++)
	cout<<x[i]<<" ";*/
	if(count%2==0)
	printf("Mani Iyer");
	else printf("Arun Gupta");
	return 0;
}
  
