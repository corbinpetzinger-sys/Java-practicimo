import java.util.Scanner;

public class UserInput {
    
 public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println(name);

        System.out.println("Enter your age");
        String age = input.nextLine();
        int ageConverted = Integer.parseInt(age);
        System.out.println("Next year " + name + "will be: " + (ageConverted + 1));

         System.out.println("What is your height in meters?");
         double height = Double.parseDouble(input.nextLine());
         System.out.println("You are " + height + " meters tall.");



//challenfe 1
         System.out.println("enter a number less than 100");
         String Num1 = input.nextLine();
         int CNum1 = Integer.parseInt(Num1);

         System.out.println("enter another number that is less than 100 when combined with the first one ");
         String Num2 = input.nextLine();
         int CNum2 = Integer.parseInt(Num2);

         System.out.println("enter a word ");
         String Str1 = input.nextLine();

         System.out.println("enter a word ");
         String Str2 = input.nextLine();


         if (CNum1 + CNum2 > 100) {
            System.out.println("your numbers don't work");
         } else {
        System.out.println(Str1 + Str2 + Num1 + Num2 + "@csaea.com" );
         }



//challenge 2


System.out.println("give me a number");
double Num3 = Double.parseDouble(input.nextLine());

System.out.println("give me a number");
double Num4 = Double.parseDouble(input.nextLine());

double Stinky = Num3 / Num4;
System.out.println(Stinky);


//challenge 3

System.out.println("Give me a diameter");
double Diameter = Double.parseDouble(input.nextLine());
double radius = Diameter / 2;
double area = Math.PI*(radius*radius);
System.out.println("the area is " + area);

}

}
