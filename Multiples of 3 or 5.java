# project-Euler


public class MutiplesOf3Or5 {
static void mutiples(){
 
           int n1=3;
           int n2=5;
           
           int sumofmultiplesof3or5=0;
           for(int i=1;i<1000;i++)
           {
              if(i%n1==0 || i%n2==0)
                   sumofmultiplesof3or5+=i;
                   
           }
           System.out.println("sum of multiples of 3or5 is"+ ""+""+ sumofmultiplesof3or5);
         
           }

public static void main(String[] args) {
// TODO Auto-generated method stub
       mutiples();
}

}
