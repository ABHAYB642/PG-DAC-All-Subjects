#include<iostream>
using namespace std;
#include<string.h>

class Adr
{
	int plotno;
    char street[20],city[20];
       public:
			 Adr(){  }
			 			 
             Adr(int pn,char st[],char ct[])
       	     {
	           this->plotno=pn;
               strcpy(street,st);
               strcpy(city,ct);
			 }
			
            void display()
            {
            	cout<<"\nPloat no. : "<<plotno<<"\nStreet : "<<street<<"\nCity : "<<city;
			}

};

class Student
{
	int roll;
	int m1,m2,m3;
	float avg;
	Adr adress;
	 public:
//	       void get():adress(pn,st[],ct[])
//		   {
//		       cout<<"Enter roll no. : ";
//			   cin>>roll;  	
//			   
//		       cout<<"Enter 3 subjets marks : ";
//			   cin>>m1>>m2>>m3;
//			   
//			   
//		   }
//Student()
//{
//		   		this->roll=1;
//		   		this->m1=1;
//		   		this->m2=12;
//		   		this->m3=123;
//		   		adress=Adr();
//}
		   Student(int roll,int m1,int m2,int m3,int pn,char st[],char ct[]):adress(pn,st,ct)
		   {
		   		this->roll=roll;
		   		this->m1=m1;
		   		this->m2=m2;
		   		this->m3=m3;
		   		adress=Adr();
		   }
		   void display()
		   {
		   	    avg=(float)(m1+m2+m3)/3;
		     	cout<<"\nRoll No: "<<roll<<"\nMarks : "<<m1<<" "<<m2<<" "<<m3<<" "<<"\nAvearge : "<<avg;   
				 adress.display();	
		   }	
};

int main()
{ 
	Student s1(1,12,12,12,101,"we","sd");
	//s1.get();
	s1.display();

	return 0;
}
