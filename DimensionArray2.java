import java.util.Scanner;
public class DimensionArray2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[][] nums = new int[3][2];


        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print("Enter an integer to row " + i + " and collumn " + j );
                nums[i][j] = input.nextInt();

    
                
    

    
                    

            }
    

         
            }
 for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {  
                System.out.print(nums[i][j] + " ");
        }

    }
input.close();
        
}

}