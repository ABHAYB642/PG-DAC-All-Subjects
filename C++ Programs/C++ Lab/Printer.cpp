//hierarchy of computer printers
//virtual and pure virtual functions 

#include <iostream>
using namespace std;

class Printer
{
	 protected:int printerid;
	 public:
	 Printer()
	  {
		cout<<"in default of base class\n";
	  }
	 Printer(int id)
	 {
		this->printerid=id;
	 }	
	 virtual void print()=0;  //pure virtual function
	 	 
};
class Networkprinter : virtual public Printer
{
	protected:
	int nwid;
	public:
	Networkprinter()
	{
		cout<<"in default of Networkprinter class\n";
	}
	Networkprinter(int id,int nwid):Printer(id)
	{
		this->nwid=nwid;
	}
	void print()
	{
	 	cout<<"Inside NetworkPrinter class \n"<<endl;
	 	cout<<"NetworkPrinter id ="<<nwid<<"Printer id ="<<printerid<<endl;
	}
};
class Fileprinter : virtual public Printer
{
	protected:
	int fid;
	public:
		Fileprinter()
	   {
		cout<<"in default of Fileprinter class\n";
	   }
		Fileprinter(int id,int fid):Printer(id)
		{
			this->fid=fid;
		}
	void print()
	 {
	 	cout<<"Inside FilePrinter class \n"<<endl;
	 	cout<<"Fileprinter id ="<<fid<<"Printer id ="<<printerid<<endl;
	 	
	 }
};
class Laserprinter :public Networkprinter, public Fileprinter
{
	int lid;
	public:
		Laserprinter()
		{
			cout<<"in default of Laserprinter \n";
		}
		Laserprinter(int id,int nwid,int fid,int lid):Printer(id),Networkprinter(id,nwid),Fileprinter(id,fid)
		{
			cout<<"in para of Laserprinter"<<endl;	
			this->lid=lid;
		}
		void print()
	 	{
	 	cout<<"Inside LaserPrinter class \n"<<endl;
	 	cout<<" Printer id = "<<printerid<<" Networkprinter id = "<<nwid<<" Fileprinter = "<<fid<<" Laserprinter = "<<lid<<endl;
	 	}
};
int main()
{
	Printer *ptr;
	Laserprinter L(30,301,401,501);
	ptr = &L;
	ptr->print();	
}
