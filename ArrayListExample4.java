import java.util.*;
public class ArrayListExample4{  
    public static void main(String args[]){  
     ArrayList<String> al=new ArrayList<>();  
     al.add("Mango");  
     al.add("Apple");  
     al.add("Banana");  
     al.add("Grapes");  
      System.out.println("Intiallist");  
      System.out.println(al);  
     //accessing the element    
     System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0  
     //changing the element  
      System.out.println("edit with set methd ");  
     al.set(1,"Dates");  
     //Traversing list  
    //  for(String fruit:al)    
    //    System.out.println(fruit);
    System.out.println(al);    
        System.out.println("sorting the list");  
     Collections.sort(al);  
     System.out.println(al); 
  //  for(String fruit:al)    
  //  System.out.println(fruit);  
   

    }  
   }  
