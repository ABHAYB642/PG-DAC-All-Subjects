#include<iostream>
using namespace std;
//to printf factors of number given by user
int main()
{
	int num;
	cout << "Enter a positive integer: ";
    cin >> num;
		int i=1;
		cout<<"for num "<<num<<" factors are "<<endl;
		while(i<=num)
		{
			if(num%i ==0)
            cout<<i<<endl;
            i++; 
		}
}