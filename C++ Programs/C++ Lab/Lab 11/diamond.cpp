#include<iostream>  
using namespace std ;  
class Base 
{   
public :  
    Base ( int a ) 
    { 
        cout << " Base :: Base ( int ) called " <<a<<endl ; 
    }  
};  
class Derived :virtual public Base 
{   
public :  
    Derived ( int a ) : Base(a)
    {  
       cout << " Derived :: Derived ( int ) called " <<a<< endl ;  
    }  
};  
class Derived_2 :virtual public Base 
{   
public :  
    Derived_2 ( int a ): Base(a)
    {  
        cout << " Derived_2 :: Derived_2 ( int ) called " <<a<< endl ;  
    }  

};  
class Result : public Derived , public Derived_2 
{  
public :  
    Result ( int a ) :Derived_2 ( a ) , Derived ( a ) 
    {  
        cout << " Result :: Result ( int ) called " <<a<< endl ;  
    }  
} ;  
int main ( )
{  
    Result rs1 ( 30 ) ;  
}
