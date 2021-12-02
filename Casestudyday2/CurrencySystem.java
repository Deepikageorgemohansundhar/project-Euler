
import java.util.Scanner;

public class CurrencySystem {
static int amount;
public int currencyCalculation(){
int n1,n2,n3,n4,n5,n6;
n1=amount/100;  amount=amount%100;
n2=amount/50;   amount=amount%50;
n3=amount/10;   amount=amount%10;
n4=amount/5;    amount=amount%5;
n5=amount/2;    amount=amount%2;
n6=amount;

int total=n1+n2+n3+n4+n5+n6;
System.out.println(total);
return total;
}
public static void main(String[] args) {
CurrencySystem cs=new CurrencySystem();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the amount");
     amount=sc.nextInt();
     cs.currencyCalculation();
}

}
