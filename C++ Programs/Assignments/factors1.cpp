#include <iostream>
using namespace std;

//to printf factors of number between 1t050
int main() {
    int n, i;
    for(n=1;n<=50;n++)
    {
        cout << "Factors of " << n << " are: "<<endl;  
        for(i = 1; i <= n; ++i) 
        {
            if(n % i == 0)
                cout << i << " "<<endl;
        }
    }
    return 0;
}