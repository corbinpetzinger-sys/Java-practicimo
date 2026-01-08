import java.util.Scanner;

public class Conditionals {
    
    public static void main(String[] args) {

 //basic Booleans
    System.out.println(" Double equals: " + (3 == 2));
    System.out.println("String equivalent: " + "Hello".equals("Hi there"));
    System.out.println("Not equals: " + (7 != 4));
    System.out.println("Greater than: " + (4 > 5));


        System.out.println();



        //if statement
            int num = 13;
            System.out.println(num <= 12);

             if (num <= 12) {
                System.out.println("num is less than or equal to 12");
            }

            //if else statement
                if (num <= 5) {
                System.out.println("num is less than or equals to 5");
            }  else  { System.out.println("Num is greater than 5 ");


            }

            //if else if else if else
                int temp = 93;
            if (temp >= 85) {
                System.out.println("It's hot");
            } else if (temp >= 60 ){
                 System.out.println("It's alright");       
            } else if (temp < 40) {
                System.out.println("It's cold"); 
            } else {
                System.out.println("ERROR!!!!");
            }



            //logical "and" operator
            int age = 17;
            boolean hasPermit = true;

            if (age >= 17 && hasPermit == true){
                System.out.println("You can drive");
            } else {
                System.out.println("Can't drive yet");
            }
                
            // using "or" = ||

            String day = "Satuday";

            if (day.equals("Saturday") || day.equals("Sunday")) {

            } else if (day.equals("Monday") ||
             day.equals("Tuesday") ||
              day.equals("Wednesday")||
               day.equals("Thursday")||
                day.equals("Friday")) {

                System.out.println("it's a weekday");
            } else {
                System.out.println("That is not a day");
            }




            //Challenge 1
            Scanner input = new Scanner(System.in);
            String Pword = "POOP";
            System.out.println("Enter your password");
            String attempt = input.nextLine();

             if (attempt.equals("Pword") {
                System.out.println("Access Granted");
            } else { 
                System.out.println("Access Denied");
            }

            //challenge 2
            System.out.println("Enter a number");
            int Num = int.parseDouble(input.nextLine());
            if (Num % 2 == 0) {
            
            System.out.println(" Even");
            } else {
            System.out.println(" Odd");

            }


            // challenge 3

            System.out.println("Enter an integer grade");
            int grade = Integer.parseInt(input.nextLine());
            if (grade >= 90) {
                System.out.println("A");
            } else if (grade >= 80) {
                System.out.println("B");
            } else if (grade >= 70) {
                System.out.println("C");
            } else if (grade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");




            }





            

            
        }

