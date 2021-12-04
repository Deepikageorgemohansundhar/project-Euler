

package Day4casestudy4;

import java.util.Scanner;
import Day4casestudy4.Address;
import Day4casestudy4.Customer;
public class Main extends Customer{

public static void main(String[] args) {

Address address=new Address();
Customer customer=new Customer(name,address);

Scanner sc=new Scanner(System.in);
System.out.println("Enter the name");
customer.name=sc.nextLine();
System.out.println("Enter the Address Details");
System.out.println("Enter the street");
address.setStreet(sc.nextLine());
System.out.println("Enter the city");
address.setCity(sc.nextLine());
System.out.println("Enter the pincode");
address.setPincode(sc.nextInt());
System.out.println(customer.toString());

}

}
