package Lab3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeService {

	static Employee[] emp ;
	static int count;
	
	static {
		emp = new Employee[10];
		count=0;
		emp[count] = new SalariedEmployee(100, "Kaustubh", "7387342305", "kaustubh0312@gmail.com", "CDAC", "Trainer", LocalDate.of(2023,12,30), 35000, 5000);
		emp[++count] =  new ContractEmployee(101, "Tejas", "9876543210", "tejasaher30122001@gmail.com", "ACTS", "Floar Cleaning", LocalDate.of(2000, 12,30), 90, 10000);
		emp[++count] =   new Vendor(102, "Prathmesh", "1023456789", "prathamesh031@gmail.com", "Sunbeam", "abc", LocalDate.of(2002, 12,30), 20, 50000);
	}

	public static boolean addNewEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which type of Employee you want to add : ");
		System.out.println("1. Salaried Employee\n2. Contract Employee\n3. Vendor Employee");
		System.out.print("Enter Choice : ");
		int choice = sc.nextInt();
		System.out.println("Enter Employee Id : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee Name : ");
		String name = sc.nextLine();
		System.out.print("Enter Employee Number : ");
		String phone = sc.next();
		System.out.print("Enter Employee Department : ");
		String dept = sc.nextLine();
		sc.nextLine();
		System.out.print("Enter Employee Email : ");
		String email = sc.nextLine();
		System.out.print("Enter Employee Designation : ");
		String desg = sc.nextLine();
		System.out.print("Enter Employee Joining Date : ");
		String dt = sc.next();
		
		LocalDate localDate = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		switch (choice) {
		case 1:
			System.out.print("Enter Salary : ");
			double sal = sc.nextDouble();
			System.out.println("Enter Bonus : ");
			double bonus = sc.nextDouble();
			emp[++count] = new SalariedEmployee(id,name,phone,email,dept,desg,localDate,sal,bonus);
			return true;
			
		case 2:
			System.out.println("Enter Hrs of working : ");
			int hrs = sc.nextInt();
			System.out.println("Enter Rate Per Hour Of Working : ");
			double rate = sc.nextDouble();
			emp[++count] = new ContractEmployee();
			emp[count].setPid(id);
			emp[count].setPname(name);
			emp[count].setMobile(phone);
			emp[count].setEmail(email);
			emp[count].setDept(dept);
			emp[count].setDesg(desg);
			emp[count].setDoj(localDate);
			((ContractEmployee) emp[count]).setHrs(hrs);
			((ContractEmployee) emp[count]).setRate(rate);
			return true;
			
		case 3:
			System.out.println("Enter Number oF employees : ");
			int noOfEmployees = sc.nextInt();
			System.out.println("Enter the fixedSalary : ");
			double fixedSalary = sc.nextDouble();
			emp[++count] = new Vendor();
			emp[count].setPid(id);
			emp[count].setPname(name);
			emp[count].setMobile(phone);
			emp[count].setEmail(email);
			emp[count].setDept(dept);
			emp[count].setDesg(desg);
			emp[count].setDoj(localDate);
			((Vendor) emp[count]).setNoOFEmployee(noOfEmployees);
			((Vendor) emp[count]).setFixedSalary(fixedSalary);
			return true;
			
		default:
			return false;
		}
	}

	public static void displayAll() {
		for (int i = 0; i < count+1; i++) {
			if(emp[i]!=null) {
				if(emp[i] instanceof SalariedEmployee)
					System.out.println((SalariedEmployee)emp[i]);
				else if(emp[i] instanceof ContractEmployee)
					System.out.println((ContractEmployee)emp[i]);
				else
					System.out.println((Vendor)emp[i]);
			}
			else {
				break;
			}
		}
	}

	public static Employee displayByEmpId(int empId) {
		for (int i = 0; i < count+1; i++) {
			if(emp[i]!=null) {
				if(emp[i].getPid()==empId) {
					return emp[i];
				}
			}
			else {
				return null;
			}
		}
		return null;
	}

	public static Employee[] displayByEmpName(String empName) {
		Employee[] e = new Employee[count+1];
		int ct=-1;
		for (int i = 0; i < count+1; i++) {
			if(emp[i]!=null) {
				if(emp[i].getPname().equalsIgnoreCase(empName)) {
					e[++ct]= emp[i];
				}
			}
			else {
				return e;
			}
		}
		return e;
	}

	public static Employee[] displayByEmpDesignation(String empDesg) {
		Employee[] e = new Employee[count+1];
		int ct=-1;
		for (int i = 0; i < count+1; i++) {
			if(emp[i]!=null) {
				if(emp[i].getDesg().equalsIgnoreCase(empDesg)) {
					e[++ct]= emp[i];
				}
			}
			else {
				return e;
			}
		}
		return e;
	}

	public static double calculateSalary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id : ");
		int id = sc.nextInt();
		Employee e = displayByEmpId(id);
		return e.CalcSalary();
	}

	public static double calculateBonus() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the employee id whose bonus you want to know : ");
		int id = sc.nextInt();
		Employee e= displayByEmpId(id);
		
		if(e instanceof SalariedEmployee) {
			return ((SalariedEmployee) e).getBonus();
		}
		return -1;
	}

	public static boolean UpdateEmployeeName() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Id whose Name You Want to modify : ");
		int id = sc.nextInt();
		Employee e= displayByEmpId(id);
		if(e!=null) {
			System.out.print("Enter the Employee Name you want to modify : ");
			String name = sc.next();
			e.setPname(name);
			return true;
		}
		return false;
	}
}
