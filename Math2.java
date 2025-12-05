class Scoreboard {

    int playerXP = 0;
    int playerLevel = 0;
    int playerHealth = 0;
    String bruhName;
    static String name = "Bruh Wars";

    Scoreboard(String username) {
        bruhName = username; 
    }
    
    void gainXP(int amount) {
        playerXP = playerXP + amount; 
        System.out.println("player " + bruhName + "Gained " + amount + "xp!");
    }
    void sayMyName() {
        System.out.println(name);
    }
    
    void heal() {
        playerHealth += 50;
    }
    void damage() {
        playerHealth -=10;
    }
    void levelUp() {
        playerLevel ++;
    }
     void levelDown() {
        playerLevel --;
    }


}

public class Math2 {
     public static void main(String[] args){


      Scoreboard player1 = new Scoreboard("sigma");
        Scoreboard player2 = new Scoreboard("SOOPUR");

        player1.gainXP(100);
        player1.gainXP(200);
        player1.heal();
        player1.damage();
        player1.levelUp();
        player1.levelUp();
        player1.levelDown();

        player2.gainXP(400);
        player2.gainXP(500);
        player2.heal();
        player2.heal();
        player2.damage();
        player2.levelUp();
        player2.levelUp();
        player2.levelDown();
        player2.sayMyName();

        System.out.println("Player 1 XP: " + player1.playerXP);
        System.out.println("Player 1 Level: " + player1.playerLevel);

        System.out.println("Player 2 XP: " + player2.playerXP);
        System.out.println("Player 2 Level: " + player2.playerLevel);

    }
}





