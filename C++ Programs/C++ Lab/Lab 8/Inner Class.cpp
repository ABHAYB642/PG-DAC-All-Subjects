#include<iostream>
using namespace std;

class Outer
{ 
  public :
  	 void display1()
  	 {
  	    cout<<"This is Outer Class";	
	 }
        
	   class Inner
	   { 
            public :
  	           void display()
  	               {
  	                 cout<<"This is Inner Class";	
                   } 
	   };	
	
};

int main()
{
	
	Outer :: Inner i1;
	i1.display();
	//Inner :: Outer o1;
	//o1.display();
}
