

package Day4CaseStudy5;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
// 
  Address address=new Address();
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Address Line 1");
  address.setAddressLine1(sc.nextLine());
  System.out.println("Enter Address Line 2");
  address.setAddressLine2(sc.nextLine());
  System.out.println("Enter the City Name");
  address.setCity(sc.next());
  System.out.println("Enter the State Name");
  address.setState(sc.next());
  System.out.println("Enter the Pincode");
  address.setPincode(sc.nextInt());
  System.out.println("The Address Details are");
  System.out.println(address.toString());

}
}
