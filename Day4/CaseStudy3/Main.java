

package ISEEC;

import java.util.Scanner;

public class Main2 {
 
public static void main(String[] args) {

Customer1[] Customer=new Customer1[100];
Customer1[] duplicateCustomer=new Customer1[100];

int customercount=0,duplicatecustomercount=0,i=0,j=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of customers");
customercount=sc.nextInt();

while(i<customercount){
Customer1 c1=new Customer1();
Address address=new Address();
System.out.printf("Enter the Customer Details %d \n",i+1);
System.out.println("Enter the name");
c1.setName(sc.next());
System.out.println("Enter the Address Details");
System.out.println("Enter the street");
address.setStreet(sc.nextLine());
System.out.println("Enter the city");
address.setCity(sc.nextLine());
System.out.println("Enter the pincode");
address.setPincode(sc.nextInt());

c1.setAddress(address);
Customer[i]=c1;
i++;


}

for(i=0;i<customercount;i++){
for(j=i+1;j<customercount;j++){
if(Customer[i].equals(Customer[j])){
duplicateCustomer[duplicatecustomercount++]=Customer[i];
}
}
}
if(duplicateCustomer[0]==null){
System.out.println("No duplicate details");
}
else{
System.out.println("The identical Customer Details:");

}
for(i=0;i<duplicatecustomercount;i++){
System.out.println((i+1)+")"+duplicateCustomer[i]);
}
}


}

