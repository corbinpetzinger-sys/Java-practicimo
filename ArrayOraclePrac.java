public class ArrayOraclePrac {
    public static void main(String args[]) {
       
            // practice 1 
// 1. it will print 7, 6, 5, 4
//2. it will print each row of the array 
//3 it will print 2, 2  1 time because they only appear together 1 time
//4. 0 / 3 / 6
   //1 / 4 / 7

//5. 7  /  14 / 11 / 11 / 5 
//6. it will print 3 / 3 / 2 / 2
//7. 3 / 3 / 3 / 7 / 6 / 5


// Pracitce 2 

//1 
double runners [] = new double[18];


//2
int first_array [] = {2, 3, 5, 7, 11 };

//3
int[] num = new int[20];
for (int i = 0; i < num.length; i++) {
    num[i] = i * 2;

//4
int[][] maze = new int[30][40];

//5
int[][] myArray = new int[16][32];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }

    //6 it will print out ever yvalue of array 6 1 by 1 in a spaced out fashion

    //7 the value for Array7[1][2] will be printed

    //8 [12][8][6] and [8][6][4] will be printed

        }



















    }
}
