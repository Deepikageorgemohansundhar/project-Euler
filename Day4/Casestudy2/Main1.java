
package ISEEC;

import java.util.Scanner;


public class Main1 extends Customer {

public static void main(String[] args) {

System.out.println("Enter the Customer Details");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Name");
customerName=sc.nextLine();
System.out.println("Enter the E-mail");
customerEmail=sc.nextLine();
System.out.println("Enter the Type");
customerType=sc.nextLine();
System.out.println("Enter the Location");
customerLocation=sc.nextLine();
Customer c=new Customer(customerName , customerEmail,  customerType,  customerLocation);
c.displayDetails();
}

}
