#include<iostream>
using namespace std;
#include<string.h>

class Address
{
	char area[20];
	char city[20];
    double pincode;
    public:
    	Address()
    	{
    		
		}
		Address(char a[],char c[],double p)
		{
			strcpy(area,a);
			strcpy(city,c);
			this->pincode=p;
		}
		void display()
		{
			cout<<"Area is "<<area<<" city : "<<city<<" pincode : "<<pincode<<endl;
			
		}
};

class student
{
	int rno;
   int marks[5];
	float avg;
	Address add;
	
	public:
		student()
		{
			rno=1;
			marks[5] ={0};
			add=Address();
		}
		student(int r,int marks[],char a[],char c[],double p):add(a,c,p)
        {
//	    cout<<"in student constructor \n";
	     this->rno=rno;
		for(int i =0; i< 5;i++)
		{
			this->marks[i] = marks[i];
		}
		//add=Address();
		}
		void display()
		{
			int sum = 0;
			for(int i =0; i< 5;i++)
			{
				sum = sum + this->marks[i];
			}
            avg=sum/5;
			cout<<"Roll no. : "<<rno<<endl;
			for(int i =0; i< 5;i++)
			{
				cout<<" Marks :"<<marks[i];
			}
			cout<<"\n Average ="<<avg<<endl;
			add.display();
		}
};


int main()
{
	int id,marks[5],n;
	char area[30],city[30];
	double pin;
	student s1[5];
	cout<<"Enter no of student : ";
	cin>>n;
	student *s[5];
	for(int i = 0; i<n ; i++)
	{
	cout<<"enter student id: ";
	cin>>id;
	for(int j =0 ; j < n; j++){
		cin>>marks[j];
	}
	cout<<"area : ";
	cin>>area;
	cout<<"Pincode : ";
	cin>>pin;
	cout<<"city : ";
	cin>>city;
	s[i] = new student(id,marks,area,city,pin);
	}
	
	for(int j =0 ; j < 5 ; j++){
		s[j]->display();
	}

	
	return 0;
	
}
