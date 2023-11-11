#include <iostream>
using namespace std;
 
class Complex
{
private:
    int real, imag;
public:
    Complex(int r = 0, int i =0)
    {  real = r;   imag = i; }
    friend void operator << (ostream &out, const Complex &c);
    friend void operator >> (istream &in,  Complex &c);
};
 
void operator << (ostream &out, const Complex &c)
{
    out << c.real;
    out  <<"+"<< c.imag <<"i"<< endl;
   
}
 
void operator >> (istream &in,  Complex &c)
{
    cout << "Enter Real Part ";
    in >> c.real;
    
    cout << "Enter Imaginary Part ";
    in >> c.imag;
    
}
 
int main()
{
   Complex c1;
   cin >> c1;
   cout << "The complex object is ";
   cout << c1;
   return 0;
}
