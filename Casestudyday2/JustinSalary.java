
import java.util.Scanner;

public class JustinSalary {
              static double salary;
              static int n,n1;
              static void weekDaysWork()
              {
             
         
             n=(int) 10+n1;
             System.out.println("Number of week day hours is"+n);
              }
              static void weekEndWork()
              {
             
             n1=(int) (salary-800)/130;
             System.out.println("Number of weekend hours is"+n1);
              }
             
public static void main(String[] args)
{
// TODO Au
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total salary paid");
        salary=sc.nextDouble();
        weekDaysWork();
        weekEndWork();
}

}
