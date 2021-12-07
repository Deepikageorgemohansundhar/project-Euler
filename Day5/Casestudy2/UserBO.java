
package Day6casestudy2;

import java.util.Arrays;

public class UserBO {
public void addUser(User[] userArray,User userIns){
for(int i=0;i<userArray.length;i++){
userArray[i]=userIns;
}
}
public void sortUsers(User[] userArray){


           Arrays.sort(userArray);


}
public Boolean deleteUser(User[] userArray,String name){

for(int i=0;i<userArray.length;i++)
{
if(userArray[i].getName().equals(name))
{
userArray[i] = null;
    }
return true;
}
return false;

}
public void displayAll(User[] userArray){

System.out.println("User Details:");
for(int i=0;i<userArray.length;i++){
if (userArray[i] != null) {
System.out.println("User"+(i+1));
System.out.println(userArray[i]);
}
}
}
}

