package com.demo.test;
import com.demo.service.*;
import java.util.Scanner;
public class TestCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CartService cs = new CartServiceImpl();
		int opt;
		int ap;
        System.out.println("Enter username");
        String username= sc.nextLine();
        
        
        
        
        
        do {
        	System.out.println("Enter 1 to buy products :");
            System.out.println("Enter 2 to exit :");
            opt = sc.nextInt();
            switch(opt)
            {
            case 1:
            {
            	cs.displayAllProduct();
            	System.out.println("Enter 1 to add product to cart :");
            	System.out.println("Enter 2 to exit:");
            	int addPro = sc.nextInt();
            	switch(addPro)
            	{
            	case 1:
            	{
            		do {
            			System.out.println("Enter 1 to add cadbury ");
                		System.out.println("Enter 2 to add kitkat ");
                		System.out.println("Enter 3 to add dark fantasy ");
                		System.out.println("Enter 4 to add oreo ");
                		System.out.println("Enter 5 to add kurkure ");
                		System.out.println("Enter 6 to submit");
                		ap=sc.nextInt();
                		
                		switch(ap)
                		{
                		case 1:
                		{
                			
                		}
                		}
            		}
            		while(ap!=6);
            		break;
            	}
            	case 2:
            	{
            		System.out.println("Thank you ");
            		break;
            	}
            	}
            	break;
            }
            
            }
        }
        while(opt!=2);
	}

}
