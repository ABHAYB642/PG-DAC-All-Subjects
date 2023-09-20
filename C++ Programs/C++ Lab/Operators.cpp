#include<iostream>
using namespace std;
int main(){
	cout<<"Unary Operators"<<endl;
	int a=10;
	int b=20;
	//postincrement
	a++;
	cout<<a<<endl;
	b++;
	cout<<b<<endl;
	//preincrement
	cout<<++a<<endl;
	cout<<++b<<endl;
	//postdecrement
	a--;
	cout<<a<<endl;
	b--;
	cout<<b<<endl;
	//predecrement
	cout<<--a<<endl;
	cout<<--b<<endl;
	cout<<"Binary Operators"<<endl;
	cout<<a+b<<endl;
	cout<<a-b<<endl;
	cout<<a*b<<endl;
	cout<<a/b<<endl;
	cout<<"Logical operators"<<endl;
	int p=45;
	int q=30;
	cout<<(p<50 && q<40) <<endl;
	cout<<(a||b)<<endl;
	cout<<(!a)<<endl;
  cout<<"Assignment operators"<<endl;
	// Assignment Operator
	cout << "a = " << a << endl;

	// Add and Assignment Operator
	cout << "a += b is " << (a += b) << endl;

	// Subtract and Assignment Operator
	cout << "a -= b is " << (a -= b) << endl;

	// Multiply and Assignment Operator
	cout << "a *= b is " << (a *= b) << endl;

	// Divide and Assignment Operator
	cout << "a /= b is " << (a /= b) << endl;
	

cout<<"Relational operators"<<endl;
	// Equal to operator
	cout << "a == b is " << (a == b) << endl;

	// Greater than operator
	cout << "a > b is " << (a > b) << endl;

	// Greater than or Equal to operator
	cout << "a >= b is " << (a >= b) << endl;

	// Lesser than operator
	cout << "a < b is " << (a < b) << endl;

	// Lesser than or Equal to operator
	cout << "a <= b is " << (a <= b) << endl;

	// true
	cout << "a != b is " << (a != b) << endl;

 cout<<"Ternary operators"<<endl;

	// Conditional Operator
	int result = (a < b) ? b : a;
	cout << "The greatest number is " << result << endl;

	return 0;
}

