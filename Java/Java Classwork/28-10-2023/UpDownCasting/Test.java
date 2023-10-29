

public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Parent p= new Child(1);//up
      // p.display1(); //error 
		
		
     
     //down
       Child c= (Child)p;
      // c.display1();
      
	  ((Child)p).display1();
	
       
       
	}

}
