
import java.util.Scanner;

public class Offer {
static int p1,p2,p3;
static int beneficalOffer(){
int Total;
float offer1;
int offer2;
float topayinoffer1;
int topayinoffer2;
Total=p1+p2+p3;
System.out.println("Total is"+Total);
offer1=(float) (0.2*Total);
System.out.println("offer1"+offer1);
if(p1>p2 && p3>p2){
offer2=p2;
}
else if(p1>p3 && p2>p3){
offer2=p3;
}
else {
offer2=p1;
}
System.out.println("offer2 is"+offer2);
topayinoffer1=(int) (Total-offer1);
System.out.println("To pay in offer 1"+""+topayinoffer1);
topayinoffer2=Total-offer2;
System.out.println("To pay in offer 2"+topayinoffer2);

if(topayinoffer1 <topayinoffer2){
System.out.println("offer 1 is beneficial");
}
else{
System.out.println("offer 2 is beneficial");
}
return 1;
}
public static void main(String[] args) {

 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the price of product1");
 p1=sc.nextInt();
 System.out.println("Enter the price of product2");
 p2=sc.nextInt();
 System.out.println("Enter the price of product3");
 p3=sc.nextInt();
 beneficalOffer();
}

}
