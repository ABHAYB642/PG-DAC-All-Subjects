//"	Design a hierarchy of computer printers. 
 //Use multiple inheritance in your hierarchy.
// Also use friend functions and classes in your program.

#include <iostream>
using namespace std;

class Printer
{
	 protected:int printerid;
	 public:
	Printer(int id)
	{
		this->printerid=id;
	}	
	virtual void print()
	 {
	 	cout<<"Inside Printer class \n"<<endl;
	 	
	 }
	 
};
class Networkprinter : public Printer
{
	int nwid;
	public:
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
class Fileprinter : public Printer
{
	int fid;
	public:
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
int main()
{
	
	Networkprinter N(10,301);
	N.print();
	
	Fileprinter F(20,401);
	F.print();
}
