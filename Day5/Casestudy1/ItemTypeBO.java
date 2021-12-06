
package Day6;

public class ItemTypeBO  {
public void add(ItemType object ,ItemType[] itemTypeArray,Integer index)
{
itemTypeArray[index]=object;
System.out.println("New item added successfully");
}
public void search(String search, ItemType[] itemTypeArray){
boolean f=false;

for(int i=0;i<itemTypeArray.length;i++){
if(itemTypeArray[i].getName().equals(search)){
f=true;
System.out.println("searched Item Type is:");
System.out.println(itemTypeArray[i]);
}
}
if(f==false){
System.out.println("searched item type not found");
}
}



public void display(ItemType[] itemTypeArray){

for(int i=0;i<itemTypeArray.length;i++){
System.out.println("Item type Number :"+(i+1));
System.out.println(itemTypeArray[i]);
}
}

}
