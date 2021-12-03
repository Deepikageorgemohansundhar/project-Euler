
package ISEEC;
import java.util.Scanner;


public class Main extends ItemType{

public static void main(String[] args) {

ItemType it=new ItemType();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the item type name");
name=sc.next();
System.out.println("Enter the cost per day");
costPerDay=sc.nextDouble();
System.out.println("Enter the deposit");
deposit=sc.nextDouble();
it.display();
}

}
