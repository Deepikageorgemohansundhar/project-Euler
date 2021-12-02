
import java.util.Scanner;

public class MagicShow {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of people who watched show 1");
int n1=sc.nextInt();
System.out.println("Enter the average rating for show 1");
float a1=sc.nextFloat();
System.out.println("Enter the number of people who watched show 2");
int n2=sc.nextInt();
System.out.println("Enter the average rating for show 2");
float a2=sc.nextFloat();
System.out.println("Enter the number of people who watched show 3");
int n3=sc.nextInt();
System.out.println("Enter the average rating for show 3");
float a3=sc.nextFloat();
float overallrating=(float)(((a1*n1)+(a2*n2)+(a3*n3))/(n1+n2+n3));
System.out.printf("The overall rating for the show %.2f\n",overallrating);

}

}
