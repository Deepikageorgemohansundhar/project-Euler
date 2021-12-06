
public class PythagoreanTriplet {
    static int a,b,c;
    static int num=1000;
    public int pythagorean(){
   
    for(a=1;a<num;a++){
    for(b=a+1;b<num;b++){
    for(c=b+1;c<num;c++){
    if (((a*a + b*b == c*c) && ((a+b+c) ==1000))){
    System.out.println("a="+a);
    System.out.println("b="+b);
    System.out.println("c="+c);
    System.out.println(a+b+c);
    int product=a*b*c;
    System.out.println("The product of abc is"+product);
   
    }
      }
    }
   
    }
   
    return 0;
    }
public static void main(String[] args) {
PythagoreanTriplet pt=new PythagoreanTriplet();
pt.pythagorean();

}

}
