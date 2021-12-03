
package ISEEC;


public class Customer{
static String customerName;
static String customerEmail;
static String customerType;
static String customerLocation;

Customer()
{
customerName="Deepika";
customerEmail="deepi@a.com";
customerType="Domestic";
customerLocation="Chengalpattu";
}
Customer(String customerName, String customerEmail, String customerType, String customerLocation){
this.customerName=customerName;
this.customerEmail=customerEmail;
this.customerType=customerType;
this.customerLocation=customerLocation;
}

void displayDetails(){
System.out.println("Name:"+customerName);
System.out.println("E-mail:"+customerEmail);
System.out.println("Type: "+customerType);
System.out.println("Location: "+customerLocation);

}
}
