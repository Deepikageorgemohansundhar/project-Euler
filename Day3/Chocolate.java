
import java.util.Scanner;

public class chocolate {
static int chocolates,children,c;
 static int chocolateDistribution(){

 for(int i=1;i<=children;i++){
if(chocolates>=i){
chocolates=chocolates-i;
c++;
}

 }
 System.out.println("chocolates Remaining"+chocolates);
 System.out.println("No of children got the chocolates"+c);
return c;
 
 }
public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of chocolates");
chocolates=sc.nextInt();
System.out.println("Enter the number of children");
children=sc.nextInt();
chocolateDistribution();

}

}
