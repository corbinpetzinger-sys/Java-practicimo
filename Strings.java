public class Strings {
    public static void main(String[] args){

        String nameObj = new String("Didi");

        //0 1 2 3
        //p o o

        String name1 = "Didi";
        String name2 = "Gogo";
        String name3 = "Gogo";

            //first line wrong
        System.out.println("name1 and nameObj:" + (name1 == nameObj));
        System.out.println("name1 and nameObj:" + name1.equals(nameObj));
        System.out.println("name1.equals(name2): " + name1.equals(name2));
        System.out.println("name2 and name3:" + (name2 == name3));

 //comparing
        System.out.println("Compare: " + name2.compareTo(name3));

         // helpful built in methods
        System.out.println("# of chars in string: " + name1.length());
        System.out.println("Index select: " + name2.indexOf("o")); 

        String quote = "Talk is cheap, show me the code.";
        String result1 = quote.substring(15);
        String result2 = quote.substring(5,13);


// overriding permammeters leads to different behaviour
        System.out.println("Full quote: " + quote);
        System.out.println("Substring 1: " + result1);        
         System.out.println("Substring 2: " + result2); 
    }

   
}