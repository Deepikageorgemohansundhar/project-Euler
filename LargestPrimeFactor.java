# project-Euler


import java.util.Scanner;

public class LargestPrimeFactor {
static long n;
public void lpf(){

for(int i=2;i<n;i++){
while(n%i==0)
{
n=n/i;
}
}
if(n>2) {
System.out.println("The largest prime factor of n is"+ n);
}



}
public static void main(String[] args) {
// TODO Auto-generated method stub
LargestPrimeFactor lp=new LargestPrimeFactor();

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to find its prime factor");
n=sc.nextLong();
lp.lpf();

}

}
