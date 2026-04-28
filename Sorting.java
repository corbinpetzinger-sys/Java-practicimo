import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int[] swapNumbers = {9, 3};

        SortingAlgorithms swap = new SortingAlgorithms(swapNumbers);

        System.out.println("Before Swap: " + Arrays.toString(swapNumbers));
        swap.swapNumbers();
        System.out.println("After Swap: " + Arrays.toString(swapNumbers));


    }
}


class SortingAlgorithms {

        //data or attributes 
        private int[] list;

        //constructor 
        public SortingAlgorithms(int[] newList) {
            this.list = newList;
        } 

        //behavior

         //behavior
       // int[] swapNumbers = {9, 3}; 
       
        public void swapNumbers() {
            int temp = list[0]; //9
            list[0] = list[1]; // 9 <-- 3
            list[1] = temp;
}

public void selectionShort() {

int n = list.length;

//outer loop
    for (int i = 0; i < n; i++) {
        
        int minIndex = i;

                //inner loop 
                for (int j = i + 1; j < n; j++){
                    
                    //conditional logic to compare values
                    if (list[j] < list[minIndex]) {
                        minIndex = j;
                    }
             }
        int temp = list[i]; 
            list[i] = list[minIndex]; // 9 <-- 3
            list[minIndex] = temp;
    }

  }

}

//often see var Temp for a temporary swapping section
// often see var n for list length