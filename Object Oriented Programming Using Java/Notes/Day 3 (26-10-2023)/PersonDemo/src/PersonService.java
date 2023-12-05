import java.util.Scanner;

public class PersonService
{
	static Person[] parr;  //parr is static array of ref 'Person Class type'
	static int cnt;        // cnt is static int var
	static 					//static block
	{
		parr=new Person[100]; //100 ref inside array ,ini array
		parr[0]=new Person(12,"Sejal","4444"); //now array of object will store in-- 
		parr[1]=new Person(13,"Ashu","5555");  //-- references of parr
		parr[2]=new Person(14,"Deepa","2323");
		parr[3]=new Person(15,"Sangeeta","5555"); 
		cnt=4;
	}
	
	public static void addNewPerson() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr id");
		int id=sc.nextInt();
		
		sc.nextLine();         //*
		System.out.println("enetr name");
		String nm=sc.nextLine();
		System.out.println("enetr mobile");
		String mob=sc.next();
		//validate the existence of id
		parr[cnt]=new Person(id,nm,mob);
		cnt++;
		
		sc.close();
	}
	
	public static void displayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(parr[i]);
		}
	}
	public static Person searchById(int id) {
		/*for(int i=0;i<cnt;i++) {
			if(parr[i].getPid()==id)
				return parr[i];
		}
		return null;*/
		for(Person p:parr)
		{
			if(p!=null)
			{
				if(p.getPid()==id)
				{
					return p;
				}
			}
			else 
			{
				return null;
			}
		}
		return null;
		
	}
	public static Person[] getByName(String nm) {
		//assumption maximum 10 people will be then with same name, other wise create array of size 100
		Person[] arr=new Person[10];
		int count=0;
		for(int i=0;i<cnt;i++) {
			if(parr[i].getPname().equals(nm)) {
				System.out.println("in if"+i);
				arr[count]=parr[i];
			    count++;
			}
		}
		if(count>0) {
			return arr;
	    }
		return null;
	}

}
