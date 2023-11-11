#include <iostream>
using namespace std;

int main()
{
	int a =10;
	int *b = &a;
	int **c = &b;
	
	cout<<**c<<"  "<<*b<<"   "<<a<<endl;
	cout<<sizeof(**c)<<endl;
	cout<<sizeof(c)<<endl;
	cout<<sizeof(*b)<<endl;
}
