# project-Euler


public class LargestPalindrome {
     
      public int palindrome(){
     int c = 0;
  for(int i=100;i<=999;i++){
  for(int j=i;j<=999;j++){
 
  int c1=i*j;
  StringBuilder n1= new StringBuilder(""+c1);
  String n2=""+c1;
  n1.reverse();
  if(n2.equals(n1.toString()) && c<c1){
  c=c1;
  }
  }
  }
  System.out.println(c);
  return c;
      }
public static void main(String[] args) {

LargestPalindrome lp=new LargestPalindrome();
lp.palindrome();
}

}
