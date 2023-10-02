#include <iostream>
using namespace std;

//FIBONACCI SERIES
int main() 
{
    int n,i=3;
    int n1=0,n2=1,n3=0;
    cout << "Enter the number of terms: ";
    cin >> n;
    cout << "Fibonacci Series: " << n1 << " " << n2 << " ";
    while(n3<=n)
    {
        n3=n1+n2;
        cout<<n3<<" ";
        
        n1=n2;
        n2=n3;
    }
}
