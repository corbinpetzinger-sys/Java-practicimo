import java.util.Scanner;
import java.lang.String;

public class computeAvg {
    public static void main(String[] args) {

    
        Scanner input = new Scanner(System.in);
        int[] Scores = new int[5];
        int avg = 0;

       for (int i = 0; i < Scores.length; i++) {
        System.out.println("Enter score " + (i + 1) + ": ");
        Scores[i] = Integer.parseInt(input.nextLine());
        avg += Scores[i];

       }
       double Trueavg = avg / Scores.length;
         System.out.println("The average is: " + Trueavg);
    input.close();
}
}
