package JavaActivity9;

import java.util.ArrayList;

public class Activity3_1 {
    public static void main(String[] args) {
        //declaring Arraylist of String objects
        ArrayList<String> myList = new ArrayList<String>();
        //Adding objects to Array List at default index
        myList.add("Pineapple");
        myList.add("Kiwi");
        myList.add("Mango");
        //Adding object at specific index
        myList.add(3, "Apple");
        myList.add(1, "Moosambi");
        
        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Chicku is in list: " + myList.contains("Chicku"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("Papaya");
        
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}