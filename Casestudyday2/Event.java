
import java.util.Scanner;

public class Event {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter branding expenses");
double a=sc.nextDouble();
System.out.println("Enter travel expenses");
double b=sc.nextDouble();
System.out.println("Enter food expenses");
double c=sc.nextDouble();
System.out.println("Enter logistics expenses");
double d=sc.nextDouble();

double TotalExpenses= (double)(a+b+c+d);
System.out.printf("TotalExpenses:%.2f\n",TotalExpenses);

float Brandingexpensespercentage=(float) ((a/TotalExpenses)*(100));
System.out.printf("Brandingexpenses:%.2f\n",Brandingexpensespercentage);

float Travelexpensespercentage=(float)(b/TotalExpenses)*(100);
System.out.printf("TravelExpenses:%.2f\n",Travelexpensespercentage);
float Foodexpensespercentage=(float)(c/TotalExpenses)*(100);
System.out.printf("TotalExpenses:%.2f\n",Foodexpensespercentage);
float logisticsexpensespercentage=(float)(d/TotalExpenses)*(100);
System.out.printf("TotalExpenses:%.2f\n",logisticsexpensespercentage);



}

}
