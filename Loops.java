public class Loops {
    public static void main(String[] args) {


                    //normal loop
        for (int i = 10000; i >= 5; i-=2) {
            System.out.println(i);

                    //nested loop
            for (int k = 0; k < 5; k += 2) {
            for (int j = 0; j < 5; j += 2) {
                System.out.println(j);


                //break


                //continue
                for (int d = 0; d < 5; d += 1) {
            if (i == 2) {
                continue;
                //continue continues to the next piece of a nested loop
                //break will stop movement, and break won't continue in a nested loop.
                //return stops the program
            }
            System.out.println(i);

                //return
                
        }





        while (true)  {

            System.out.println("true");




             // for (int i = 0; i < 5; i++)

        //they do the same thing

        int x = 0;
        while (x < 5) {
            

            x++;





            boolean isContinuing;


        while (isContinuing) {
            int z = 0;
            z++;
            if (z == 20) {
                isContinuing = false;
            }
            System.out.println(z);
        }

        }





    }
        }
    
    }}

//challenge 1
for (int i = 0; i <= 100; i++) {
    if (i % 3 == 0 && i % 5 == 0 ) {
     System.out.println("foobar");
    } else if (i % 3 == 0 ){
     System.out.println("foo");       
    } else if (i % 5 == 0) {
    System.out.println("bar"); 




    //challenge 2 

    for (int k = 1; k <= 12; k ++) {
        for (int j = 1; j <= 12 ; j ++) {
            System.out.print(k * j + "\t");
        }
        System.out.println();
    }

    // challenge 3
    
    int secretNumber = 2;
    int guess = 0;
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    
    while (guess != secretNumber) {
        System.out.print("Guess a number between 1 and 3: ");
        guess = scanner.nextInt();
        
        if (guess == secretNumber) {
            System.out.println("Correct answer!");
        } else {
            System.out.println("Wrong answer, try again.");
        }
    }
    scanner.close();

    

