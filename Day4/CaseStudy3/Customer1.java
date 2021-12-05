

package ISEEC;

import java.util.Objects;


public class Customer1 extends Address {

              String name;
              Address address;
              Customer1 (){
             
              }
              Customer1 (String name,Address address){
             this.name=name;
             this.address=address;
              }
             
             
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public Address getAddress() {
return address;
}
public void setAddress(Address address) {
this.address = address;
}
@Override
          public boolean equals(Object b){
          if(this==b){
          return true;
          }
          if(b==null){
          return false;
          }
          if(getClass() !=b.getClass()){
          return false;
          }
          Customer1 obj=(Customer1) b;
          return Objects.equals(name, obj.name)&& this.address.equals(obj.getAddress());
          }
              @Override
          public String toString(){
          return "Name:"+ name +"\n"+"Address:"+ address.toString();
          }



}
