
import java.util.Scanner;

public class SquareSum {
static int n,sum,sum1,diff;
static int squareofsum()
{

sum=((n *(n + 1) *((2 *n) + 1)) )/ 6;
System.out.println(sum);
return n;

}
static int sumofsquare(){

sum1=(int) Math.pow((n*(n +1 )/ 2),2);
System.out.println(sum1);
return n;
}
static void sumdifference(){

diff=sum1-sum;
System.out.println(diff);
}
public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to find square of sum and sum of square");
n=sc.nextInt();
squareofsum();
sumofsquare();
sumdifference();
}

}
