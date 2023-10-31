
public class BankService {
    static Bank[] bnkarr;
    static int cnt;
    
    static {
    	bnkarr = new Bank [50];
    	bnkarr[0]=new Bank("SBI","PUNE",1234,new Customer(1,2000,"saving","7899"),);
//    	bnkarr[0]=new Bank(1,2000,"Abhay");
//    	bnkarr[1]=new Bank(2,4000,"Sujit");
    	cnt=2;
    	
    }

	public static boolean openAcc(int ano,double bal,String name) {
		if(bal>=2000) {
		bnkarr[cnt]=new Bank(ano,bal,name);
		cnt++;
		return true;
		}
	
		return false;
	}

	public static void Listall() {
		for(Bank b:bnkarr) {
			if(b!=null) {
				System.out.println(b);
			}
			
		}
		
	}

	public static boolean Deposit(int ano,double bal) {
		for(int i =0;i<cnt;i++) {
			if(ano==bnkarr[i].getAccno())
			{
				double newbal=bnkarr[i].getBal()+bal;
				bnkarr[i].setBal(newbal);
				return true;
			}
			
		}
		return false;
	
	}
	
	public static int searchbyacno(int ano)
	{
		for(int i=0;i<cnt;i++) {
			if(bnkarr[i].getAccno()==ano)
			{
				return i;
			}
		
		}
		return -1;
	}

	public static int Withdraw(int ano,double bal) {
	    int pos=searchbyacno(ano);
	    //System.out.println(pos);
	    if (pos!=-1) {
	    	for(int i=0;i<cnt;i++) {
	    		
	    		if(bnkarr[i].getBal()-bal>1000)
	    		{
	    			double newbal=bnkarr[pos].getBal()-bal;
	    			bnkarr[pos].setBal(newbal);
	    			return 1;
	    			
	    		}	
	    		return 2;
	    	}
	    }
	    return 3;
	}  
}
