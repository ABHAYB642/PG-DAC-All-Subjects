import java.time.LocalDate;

public class TestInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Employee e1 = new Employee(1,"shubham","1234567890","emp@email.com","Hr","MainHead",LocalDate.of(2000,4,17));
		//System.out.println(e1);
		
	//	Employee e2 = new Employee(2,"harsh","1234567890","emp@email.com","Hr","MainHead",LocalDate.of(2007,7, 7));
		//System.out.println(e2);
		
		SalariedEmployee se1 = new SalariedEmployee(3,"om","1234567890","emp@email.com","SD","MainHead",LocalDate.of(2007,7, 7),5000,2000);	
		System.out.println(se1);
		
		SalariedEmployee se2 = new SalariedEmployee(4,"vivek","1234567890","emp@email.com","Hr","MainHead",LocalDate.of(2007,7, 7),50000,200);	
		System.out.print(se2);
		double a = se2.calculatesal();
		System.out.println("Total Sal : " +a);
		
		ContractEmployee ce1 =new  ContractEmployee(5,"shiv","1344567890","emp@email.com","MaNAGER","MainHead",LocalDate.of(2007,4, 3),100000,5000);
		System.out.println(ce1);
		
		ContractEmployee ce2 =new  ContractEmployee(6,"shiv","1344567890","emp@email.com","MaNAGER","MainHead",LocalDate.of(2007,4, 3),10,500);
		System.out.print(ce2);
		double a1 = ce2.calculatesal();
		System.out.println("Total Sal : " +a1);
		
		Member m1 = new Member(7,"suraj","1234567890","emp@email.com","Golden Membership",5000);
		System.out.println(m1);
		
		Member m2 = new Member(8,"swapnl","1234567890","emp@email.com","Golden Membership",5000);
		System.out.println(m2);
		
		Vendor v1 = new Vendor(9,"sagar","9455674500","emp@email.com","Hr","MainHead",LocalDate.of(2000,4,17),15,20000);
		System.out.println(v1);
		
		Vendor v2 = new Vendor(10,"sagar","9455674500","emp@email.com","Hr","MainHead",LocalDate.of(2000,4,17),20,5000);
		System.out.print(v2);
		double a2 = v2.calculatesal();
		System.out.println("Total Sal : " +a2);
	}

}
