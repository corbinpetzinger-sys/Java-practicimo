import java.util.Scanner;
public class ArrayNew {
    

    public static void main(String args[]) {
    int[] array = {-20, 19, 1, 5, -1, 27, -50, 5};

    int min = array[0]; 

    for (int index=0; index< array.length; index++)
        if (array[index] < min)
            min = array[index];

    System.out.println("Minimum value is: " + min);

    int target = 6;
    int[] numbers = {0, 2, 4, 6, 8};
    boolean targetFound = false;

    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == target) {
            targetFound = true;
            break;
        }
}
System.out.println("Target found: " + targetFound);

int[] number = {0,0,0,1,0};
boolean allsame = true;
for (int index=1; index< number.length; index++) {
    if (number[0] != number[index]) {
        allsame = false;
        break;
    }

}
String[] names = {"George", "John", "Xinyl", "Maria"};

for (String name : names) {
    System.out.println("name is " + name);
}





    }
}


    




