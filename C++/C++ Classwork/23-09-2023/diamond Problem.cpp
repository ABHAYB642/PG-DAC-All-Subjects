#include<iostream>
using namespace std;
#include<string.h>
class vehicle
{
	protected:
	int num;
	char a[10];
	
	public:
	  vehicle()
	  {
	  	
	  }	
	  vehicle(int n,char name[])
	  {
	  	this->num=n;
	  	strcpy(this->a,name);
	  }
	  virtual void display()
	  {
	  	cout<<"vehicle no "<<num<<"\n vehicle name "<<a<<endl;
	  }
	  virtual int milage()=0;
};
class car:virtual public vehicle
{
	protected:
	  int mil;
	  int dist;
	  int lit;
	  
	public:
		car()
		{
			int dist=0;
			int lit=0;
		}
		car(int dist,int lit)
		{
			this->dist=dist;
			this->lit=lit;
		}
		int milage()
		{
			return dist/lit;
		}
		void display()
	  {
	  	vehicle::display();
	  	//cout<<"dist: "<<dist<<"in lit "<<lit<<endl;
	  }		
};
class sportscar:virtual public vehicle
{
	protected:
       int sdist;
 		int slit;
		int power;
	public:
	    sportscar()
		{
			
		}	
		sportscar(int power,int sdist,int slit)
		{
			this->sdist=sdist;
			this->slit=slit;
			this->power=power;	
		}
		int milage()
		{
			return (sdist/slit)-power;
		}
		void display()
	    {
	    vehicle::display();
	  	cout<<"sportscar dist: "<<sdist<<"sportscar in lit "<<slit<<endl;
	   }	
};
class turbocar:public car,public sportscar
{
	int turbo;
	
	public:
		turbocar()
		{
			
		}
		turbocar(int turbo,int power,int dist,int lit,int n,char name[]):vehicle(n,name),car(dist,lit),sportscar( power,sdist,slit)
		{
			this->turbo=turbo;
		}
		int milage()
		{
			return (dist/lit)-power+turbo;
		}
		void display(){
			cout<<turbo<<endl;
		}
};
int main()
{
	vehicle *v = new turbocar(1,5,60,21,6,"audi");
	cout<<"Milage of turbocar : "<<v->milage()<<endl;
	//;v->display();
	
}
