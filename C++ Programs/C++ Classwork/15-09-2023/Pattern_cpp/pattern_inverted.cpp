#include <iostream>
using namespace std;
//#include <bits/stdc++.h>
int main()
{
    int n=4;
    char ch = 'A';
    for(int i=n;i>=1;--i)
    {
        for(int j=1;j<=i;j++)
        {
            cout<<ch;
        }
        ch++;
        cout<<endl;
    }
}