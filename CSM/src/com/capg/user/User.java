package com.capg.user;

import java.util.Scanner;

import com.capg.beans.Customer;
import com.capg.service.CustomerServicesImp;
import com.capg.service.ICustomerService;

public class User {

	public static void main(String[] args) {

		ICustomerService service = new CustomerServicesImp();
		
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Hi");
			System.out.println("Menu");
			System.out.println("1.Add Customer");
			System.out.println("2.Update Customer");
			System.out.println("3.Getting Customer by id");
			System.out.println("4.Delete customer by id");
			System.out.println("5.Print all customer");
			System.out.println("6.Exit");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				Customer customerbean = new Customer();
				System.out.println("Enter Customer id");
				int cid = scan.nextInt();
				scan.nextLine();
				customerbean.setCid(cid);
				System.out.println("Enter Customer Name");
				String cname = scan.next();
				customerbean.setCname(cname);
				System.out.println("Enter Amount");
				Double amount = scan.nextDouble();
				customerbean.setAmount(amount);
				/*System.out.println("enter date of purchase");
				//String date = scan.next();
				//LocalDate dop = LocalDate.of(, 02, 13);
*/				boolean isValid = CustomerServicesImp.userValidations(customerbean);
				if(isValid) {
					service.addCustomer(customerbean);
				}
				else {
					System.err.println("Invalid Input");
				}
			
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:
				System.out.println("Thank You..!!");

				break;

			default:
				System.err.println("plese enter valid input");
				break;
			}
		}

	}

}