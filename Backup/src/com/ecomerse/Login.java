package com.ecomerse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {
	
	
	Product p=new Product();
	UserOpearations operation=new UserOpearations();
	Cart cart =new Cart();
	ReturnEcomerse re=new ReturnEcomerse();
	
	public void RegisterdUsers() {
		 Connectiontest test=new  Connectiontest();
		  Connection connection = null;
	      PreparedStatement psr = null;

		List list = new ArrayList();

		try {
			//ConnectionTest connectionTest = new ConnectionTest();
			Connection con=test.getConnectionDetails();

			psr = con.prepareStatement("select Username,Password from users");

			ResultSet rs = psr.executeQuery();

			while (rs.next()) {
				list.add(rs.getString(1));
				list.add(rs.getInt(2));
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	
		
          
			System.out.print("Enter your Username :");
	        Scanner sc=new Scanner(System.in);
			String Username= sc.next();
			System.out.print("Enter your Password :");
			int Password=sc.nextInt();
			
			if (list.contains(Username)&& list.contains(Password)) {
				System.out.println();
				System.out.println("Login successfully...");
				}
			else {
				System.out.println("Inavild Username or Password");
			}
			

			String choice="";
			while(!choice.equals("2")) {
				
		    System.out.println("**********Welcome to E-shop**********");
			System.out.println("press '1' to show product list");
		    System.out.println("press '2' to buy the product");
				
			 Scanner sc1=new Scanner( System.in);
	         choice=sc1.next();
	         
	         switch(choice) {
	         
	         case "1":
	        	 //To display the prodctlist
	        	 p.Productretrive();
	        	  break;
	         case "2":
	        	 // To Buy the product
	        	 cart.getBuyproduct();
	        	 Scanner sc3=new Scanner( System.in);
	        	 System.out.println("press '1' to Continue to order & otherwise press '2' to exit");
	             int entry =sc3.nextInt();
	        	
	        	 if(entry==1) {
	        		 // To display cart details & calclate Total price
	        		 cart.getTotalbillrecipt();
	        		 System.out.println("**********Thank you for shopping**********"); 
	        	 }
	        	 else if(entry==2) {
	        		// Returning to Ecomerse class
	        		 re.getReturnEcomerse(); 
	        	 }
	        	 
	        	 
	        	  break;
	         default:
	             System.out.println("Inavlid input ");
	         }
	        
	     }
			      // Returning to Ecomerse class
					re.getReturnEcomerse();
		
	
	}


}
