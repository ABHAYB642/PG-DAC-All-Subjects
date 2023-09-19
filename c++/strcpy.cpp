#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
    char *strOrig, *strCopy;
    
    cout<<"Enter the string: ";
    gets(strOrig);
    strOrig=new char[10];
    strCopy=new char[10];
   // origPtr = &strOrig[0];
    //copPtr = &strCopy[0];
    while(*strOrig)
    {
        *strCopy = *strOrig;
        strOrig++;
        strCopy++;
    }
    *strCopy = '\0';
    cout<<"\nEntered String: "<<*strOrig;
    cout<<"\nCopied String: "<<*strCopy;
    cout<<endl;

    delete[] strOrig;
    delete[] strCopy;
    return 0;
}