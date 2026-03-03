

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo {
    
    public static void main(String[] args) {
        
      ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list);

        System.out.println(list.size());


       //  ArrayList<Integer> list2 = new ArrayList<Double>();
       //ArrayList<> list3  = new ArrayList<Integer>(); 

       // we can only specify one type parameter for an array list,

       list.add(1);
        list.add(2);
         list.add(3);
          list.add(4);
           list.add(5);
           System.out.println(list);
           System.out.println(list.size());
            // we can add elements to an array list using the add method.
           list.add(1, 5);
              System.out.println(list);
                // we can also add elements at a specific index using the add method with an index parameter.


              list.get(5);
              //is how we access elements in an array list, 
              // but we have to be careful about the index we use. 
              // If we try to access an index that is out of bounds,
              // we will get an error.

              list.remove(1);
                System.out.println(list);
                // we can also remove elements from an array list using the remove method.

                list.remove(Integer.valueOf(5));
                System.out.println(list);
                // we can also remove elements by value using the remove method with an object parameter.

                list.contains(3);
                // we can check if an array list contains a specific element using the contains method.


                Collections.sort(list);
                Integer max = Collections.max(list);
                Integer search = Collections.binarySearch(list, 4);
                System.out.println(list);
                // we can also sort an array list using the sort method from the Collections class.

                Integer[] arr = list.toArray(new Integer[0]);
                for (int val : arr) {
                    System.out.print(val + " ");
                    // we can also convert an array list to an array using the toArray method.


                }

                ArrayList<Integer> splitlist = new ArrayList<Integer>(list.subList(1, list.size()-1));
                System.out.println(splitlist);
                // we can also create a new array list from a sublist of an existing array list, it is inclusive.

                list.clear();
                System.out.println(list);
                System.out.println(list.size());
                // we can also clear an array list using the clear method, which removes all elements from the list, resetting it. 

                
        //challenge 1
    // Create an arrayList with 10 random numbers
    // Remove all odd from that list
    
    ArrayList<Float> list1 = new ArrayList<Float>();
        for (int i = 0; i <= 10; i++) {
            list1.add((float)(Math.random() * 10));
            list1.removeIf(n -> n % 2 != 0);
            System.out.println(list1);


        }



        //challenge 2
    // Make a guest list that allows the user to enter names
    // if the name exists tell the user that "this person is invited!"
    // continue until you type exit
 ArrayList<String> guestList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter names to add to the guest list (type 'exit' to finish):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            if (guestList.contains(name)) {
                System.out.println("This person is invited!");
            } else {
                guestList.add(name);
                System.out.println(name + " has been added to the guest list.");
            }
        }
        System.out.println("Final guest list: " + guestList);
        scanner.close();

            



        //challenge 3
    // Create a list of grocery items
    // if the user types in a food print out the index
    // If not print "Not Found" and add it to the list
    // continue until you type exit
    ArrayList<String> groceryList = new ArrayList<String>();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter grocery items (type 'exit' to finish):");
            while (true) {
                String item = scanner2.nextLine();
                if (item.equalsIgnoreCase("exit")) {
                    break;
                }
                if (groceryList.contains(item)) {
                    int index = groceryList.indexOf(item);
                    System.out.println(item + " is at index " + index);
                } else {
                    groceryList.add(item);
                    System.out.println(item + " has been added to the grocery list.");
                }
            }
            System.out.println("Final grocery list: " + groceryList);
            scanner2.close();
    }
}
