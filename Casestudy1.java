# project-Euler


public class casestudy1
{
static int date;
static int billnumber;
static int D,B,D1,B1;
static String customername;

public int luckyCustomer()
{
D=date%10;
B=billnumber%10;
D1=date%100;
B1=billnumber%100;
if((D==B ||D1==B1) && (billnumber%date==0)){
System.out.println( customername +" is a Lucky Customer");
}
else
{
System.out.println("Not a Lucky Customer");
}

return 1;
}
public static void main(String[] args) {

// TODO Auto-generated method stub
casestudy1  s=new casestudy1 ();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Customer name");
customername=sc.next();
System.out.println("Enter the date");
date=sc.nextInt();
System.out.println("Enter the bill number");
billnumber=sc.nextInt();

s.luckyCustomer();

}

}
