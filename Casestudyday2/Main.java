
import java.util.Scanner;

public class Main {
static int overs,targetruns,oversbowled,runsscored;
    public int runrate(){
    float currentRunrate;
    currentRunrate =(float)runsscored / oversbowled ;
    System.out.printf("The current run rate is"+"%.2f\n",currentRunrate );
    float runraterequired;
    runraterequired=(float)(targetruns-runsscored)/(overs-oversbowled);
    System.out.printf("The current run rate is"+"%.2f\n",runraterequired );
    return 0;
    }
public static void main(String[] args) {
Main m=new Main();

Scanner sc=new Scanner(System.in);
System.out.println("Enter total number of overs");
         overs=sc.nextInt();
         System.out.println("Enter target runs");
         targetruns=sc.nextInt();
         System.out.println("Enter overs bowled");
         oversbowled=sc.nextInt();
         System.out.println("Enter runs scored");
         runsscored=sc.nextInt();  
         m.runrate();
         
}

}
