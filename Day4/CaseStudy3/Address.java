

package ISEEC;

import java.util.Objects;

public class Address {
private String street;
private String city;
private Integer pincode;

public Address()
{
}
public Address(String street,String city,Integer pincode){
this.setStreet(street);
this.setCity(city);
this.setPincode(pincode);
}
public String getStreet() {
return street;
}
public void setStreet(String street) {
this.street = street;
}
public String getCity() {
return city;
}
public void setCity(String city) {
this.city = city;
}
public Integer getPincode() {
return pincode;
}
public void setPincode(Integer pincode) {
this.pincode = pincode;
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
Address obj=(Address)b;
return Objects.equals(street,obj.street) &&
Objects.equals(city, obj.city) &&
Objects.equals(pincode, obj.pincode);
}
@Override
public String toString(){
return  getStreet() +","+ getCity() +"-"+ getPincode();
}
}


