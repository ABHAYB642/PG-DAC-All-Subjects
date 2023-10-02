#include<iostream>
using namespace std;
class Demo  
{  
    int a;  
    int b;  
    int *p;  
    public:  
    Demo()  
    {  
         
    }  
    void setdata(int x,int y,int z)  
    {  
        a=x;  
        b=y;  
        p=new int(z);  
    }  
    void showdata()  
    { 
        std::cout << "value of a is : " <<a<< std::endl;  
        std::cout << "value of b is : " <<b<< std::endl;
		
			std::cout << "value of *p is : " <<*p<< std::endl;  
		 
        
    }  
//    Demo(Demo &d)
//    {
//    	this->a=d.a;
//    	this->b=d.b;
//
//		p=new int(*(d.p));
////		*p=d.*p;
//	}
    ~Demo()
    {
    	cout<<"destructor is called"<<endl;
	   if(p)
	   delete []p;
	    p=NULL;

	}
};  
int main()  
{  
  Demo d1;  
  d1.setdata(4,5,7);  
  Demo d2(d1) ;
  d1.~Demo();

	//d1.showdata();
	  
  {
  	d2.showdata(); 
  } 
    return 0;  
}  
