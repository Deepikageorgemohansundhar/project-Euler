
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

ItemTypeBO it=new ItemTypeBO();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number of Item Type");
int n=sc.nextInt();
ItemType[] itemTypeArray=new ItemType[n];
for(int i=0;i<n;i++){
System.out.println("Enter the Item Type "+(i+1)+" "+"Name");
String name=sc.next();
System.out.println("Enter the Deposit Amount");
Double deposit=sc.nextDouble();
System.out.println("Enter the Cost per day");
Double costPerDay=sc.nextDouble();
itemTypeArray[i]=new ItemType(name,deposit,costPerDay);
it.add(itemTypeArray[i],itemTypeArray,i);
}
it.display(itemTypeArray);
System.out.println("Enter the Name of the item to be searched");
String search=sc.next();
it.search(search, itemTypeArray);

}
}
