package com.ecomerse;

import java.util.Scanner;

public class Ecomerse {
	
public void Ecomerse() {
		
		System.out.println("*********** Welcome to E-Cart *************");
		 System.out.println();
		System.out.println("1. Admin");
        System.out.println();
		System.out.println("2. User registeration");
		System.out.println();
		System.out.println("3. Login");
		System.out.println("-----------------------------");
		System.out.println("Enter your choice-->>");
		
		//use Scanner class take input from user
		Scanner sc=new Scanner( System.in);
		int entry=sc.nextInt();
		  
		//for Admin class 
		if(entry==1){
	    Admin admin=new Admin();
		admin.productinfo();
		}
		
		//for User class
		else if(entry==2){
	    User user=new User();
		user.getuserdetails();
		}
		
        else if(entry==3){
		    Login login=new Login();
			login.RegisterdUsers();
		}
		
		else{
		System.out.println("Invalid input.. Please coorect input move on E-cart ");
		Ecomerse e=new Ecomerse();
		e.Ecomerse();
		}
	}
}
