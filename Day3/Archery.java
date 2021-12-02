
import java.util.Scanner;

public class Archery {
     static int turns,count;
public int game(){
Scanner sc=new Scanner(System.in);
int target=100;

for(int i=0;i<target;i++){
System.out.println("Enter points scored");
turns+=sc.nextInt();
count++;
if(turns>=100){
System.out.println("Target Reached");
break;
}
}
System.out.println("Total number of turns taken :"+count);
return turns;
}
 
 
public static void main(String[] args) {

Archery a=new Archery();
a.game();
}

}
