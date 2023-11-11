//"	Design a hierarchy of computer printers. 
 //Use multiple inheritance in your hierarchy.
// Also use friend functions and classes in your program.

#include <iostream>
using namespace std;


class Networkprinter
{
	protected:
	int nwid;
	public:
	Networkprinter()
	{
		cout<<"in default of Networkprinter class\n";
	}
	Networkprinter(int nwid)
	{
		this->nwid=nwid;
	}
	void print()
	{
	 	cout<<"Inside NetworkPrinter class \n"<<endl;
	 	cout<<"NetworkPrinter id ="<<nwid<<endl;
	}
};
class Fileprinter
{
	protected:
	int fid;
	public:
		Fileprinter()
	   {
		cout<<"in default of Fileprinter class\n";
	   }
		Fileprinter(int fid)
		{
			this->fid=fid;
		}
	void print()
	 {
	 	cout<<"Inside FilePrinter class \n"<<endl;
	 	cout<<"Fileprinter id ="<<fid<<endl;
	 	
	 }
};
class Laserprinter : public Networkprinter, public Fileprinter  //multiple inheritance 
{
	private:
			int lid;
	public:
		Laserprinter()
		{
			cout<<"in default of Laserprinter \n";
		}
		Laserprinter(int lid,int nwid,int fid):Networkprinter(nwid),Fileprinter(fid)
		{	
			cout<<"in para of Laserprinter"<<endl;	
			this->lid=lid;
		}
		void print()
	 	{
	 		cout<<"Inside LaserPrinter class \n";
	 		cout<<" Laserprinter id = "<<lid<<endl;
	 		cout<<" Laserprinter id = "<<lid<<" Fileprinter id = "<<fid<<" NetworkPrinter id = "<<nwid<<endl;
	 	}
	 	friend void update(Laserprinter &);
};
void update(Laserprinter &h)  //friend functions
{
	cout<<"to update id of Laserprinter \n";
	cin>>h.lid;
	cout<<"Laserprinter updated id = "<<h.lid<<endl; 
}
int main()
{
	Laserprinter L(301,401,501);
	L.print();	
	
	cout<<endl;
	Laserprinter L1;
	update(L1);	
}
