

package Day4casestudy4;

public class Customer {
static String name;
Address address;

public Customer(){

}
public Customer(String name,Address address){
this.name=name;
this.address=address;
}
@Override
public String toString(){

return name+" "+" "+address.toString();
}

}
