
package Day6casestudy2;

import java.util.Scanner;


public class Main {

public static void main(String[] args) {
UserBO ubo=new UserBO();
String name= null;
boolean isUserDeleted = false;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of users:");
int n=sc.nextInt();
User[] userArray=new User[n];
User userIns=new User();
for(int i=0;i<n;i++){
System.out.println("Enter the details of User "+""+(i+1));
System.out.println("Enter the name of the user:");
   userIns.setName(sc.next());
System.out.println("Enter the mobile number of the user:");
userIns.setMobileNumber(sc.next());
System.out.println("Enter the username of the user:");
userIns.setUsername(sc.next());;
System.out.println("Enter the password of the user:");
userIns.setPassword(sc.next());
ubo.addUser(userArray, userIns);
}
   System.out.println("User details as entered:");
   for(int i=0;i<n;i++){
   userArray[0]=new User(userIns.getName(),userIns.getMobileNumber(),userIns.getUsername(),userIns.getPassword());
   }
ubo.displayAll(userArray);

ubo.sortUsers(userArray);
System.out.println("After sorting:");
System.out.println("User Details:");
ubo.displayAll(userArray);
System.out.println("Enter the user to be deleted:");

   name=sc.next();
isUserDeleted = ubo.deleteUser(userArray,name );

if ( isUserDeleted) {
System.out.println("User deleted successfully");
System.out.println("After Deleting:");
ubo.displayAll(userArray);
} else {
System.out.println("No user found with given name");
}



}

}

