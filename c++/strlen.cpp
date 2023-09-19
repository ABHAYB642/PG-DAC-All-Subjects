#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
    char *str;
    str=new char[10];
    int len=0;
    cout<<"Enter the String: ";
    gets(str);
    while(*str)
    {
        len++;
        str++;
    }
    cout<<"\nLength = "<<len;
    cout<<endl;

    delete [] str;
    return 0;
}