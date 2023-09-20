#include<iostream>
#include<math.h>
using namespace std;
//compound interest

int main()
{
   double p=5000,amt;
   float r=7.5;
   int n=2;
   
   amt=p*pow((1+r/100),n);
   cout<<"Amount ="<<amt<<endl;
   cout<<"Compound Interest="<<amt-p<<endl;
   
   return 0;
	
}
