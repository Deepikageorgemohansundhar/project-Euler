
import java.util.Scanner;

public class Watermelon {
     static int weightofwatermelon;
     static void watermelonsplitting()
     {
    if(weightofwatermelon%2==0){
    int n1;
    n1=weightofwatermelon/2;
    System.out.println("I get"+n1+"kg"+"my sibling get"+n1+ "kg");
    }
    else
    {
    System.out.println("Sorry!,you can't buy,look for even weight watermelon");
    }
    System.out.println("The possible ways of splitting watermelon");
    for(int i=1;i<weightofwatermelon;i++){
    System.out.println(i +"" +(weightofwatermelon -i));
    }
     }
public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter the weight of the watermelon");
weightofwatermelon=sc.nextInt();
        watermelonsplitting();
}

}
