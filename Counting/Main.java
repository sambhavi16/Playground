#include<stdio.h>
#include<string.h>
int main()
{
  char line[1000];
    int i, v=0, c=0, ch=0, d=0, s=0, o=0;
    gets(line);
    for(i=0;line[i]!='\0';++i)
    {
        if(line[i]=='a'||line[i]=='e'||line[i]=='i'||line[i]=='o'||line[i]=='u' || line[i]=='A' || line[i]=='E' || line[i]=='I' || line[i]=='O' || line[i]=='U')
            v++;
        else if((line[i]>='a'&& line[i]<='z') || (line[i]>='A'&& line[i]<='Z'))
            c++;
        else if(line[i]>='0'&&c<='9')
            d++;
        else if (line[i]==' ')
            s++;
    }
    printf("Vowels:%d",v);
    printf("\nConsonants:%d",c);
   printf("\nWhite Spaces:%d",s);
    printf("\nDigits:%d",d);
  printf("\nSymbols:%d",0);
    return 0;
}