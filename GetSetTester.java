


import java.util.Scanner;

public class GetSetTester {
    public static void main(String[] args) {

        GetSet name = new GetSet();
        System.out.println(name.getUsername());

GetSet player1 = new GetSet();
GetSet player2 = new GetSet();
GetSet player3 = new GetSet();
GetSet player4 = new GetSet();

        System.out.println(player1.getUsername()); //displays default username value of null
        player1.setUsername("stinkertoe"); //sets (or mutates) username to new value
        System.out.println(player1.getUsername()); //displays new username 

        System.out.println(player2.getUsername()); //displays default username value of null
        player2.setUsername("Baba"); //sets (or mutates) username to new value
        System.out.println(player2.getUsername()); //displays new username 

        System.out.print("Enter a username: ");
        Scanner input = new Scanner(System.in);
        String user = input.nextLine();
        player3.setUsername(user);
        System.out.println(player3.getUsername());

        
        
        System.out.print("Enter an ID for your player: ");
        int id = input.nextInt();
        player4.setId(id);
        System.out.print("Enter your rank (between N00b, blud, mid,  Yes, Pro, Hacker, Celestial): ");
        String rank = input.next();
        player4.setRank(rank);
        System.out.println("Enter a username: ");
        String username = input.next();
        player4.setUsername(username);


        System.out.println(player4.getId());
        System.out.println(player4.getRank());
        System.out.println(player4.getUsername());
        if (player4.getRank().equals("Celestial")){
            System.out.println("You are amazing and I love you!");
        } else if (player4.getRank().equals("Hacker")){
            System.out.println("You are pretty good, but there's still more room");
        } else if (player4.getRank().equals("Pro")){
            System.out.println("You are quite a decent player!");
        } else if (player4.getRank().equals("Yes")){
            System.out.println("You are ok");
        } else if (player4.getRank().equals("Mid")){
            System.out.println("You can be fun to play with!");
        } else if (player4.getRank().equals("blud")){
            System.out.println("You are not a fun player!");
        } else if (player4.getRank().equals("N00b")){
            System.out.println("You stinky stinky stinky stinky player, you can't do anythhing right, LOSERRRRRRRR");
        } else {
            System.out.println("Invalid rank entered.");
        }
       
       

        


    }
}

class GetSet{

    private String username = "Bezzostoes";
    private int id = 000000000;
    private String rank = "NOOOOOOOB";

    //accesor methods aka getter methods:
    public String getUsername() {
        return username;
    }
    public int getId() {
        return id;
    }
    public String getRank() {
        return rank;
    }
//accessor methods aka setter methods:
    public void setUsername(String username) {
        this.username = username;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    
}



