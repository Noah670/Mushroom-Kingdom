import java.lang.System.Logger.Level;
import java.util.Scanner;

//Level1.java
// 4-6-2020
// Noah Pohl

// Level 1 of the Mushroom Kingdom

public class Level1 {
    public static void main(String[] args) {

        MushroomKingdom Level1 = new MushroomKingdom();

        System.out.println("Welcome to the Mushroom kingdom");
        System.out.println("What is your name?");

        Scanner userInput = new Scanner(System.in);
        String playerName = userInput.nextLine();
        Level1.setPlayerName(playerName);
        System.out.println(
                "Hello " + Level1.getPlayerName() + " you will be able to choose a partner to help you in battle.");

        // set the unique abilities for each Characters in the Mushroom Kingdom

        Level1.setMario("Ground Pound");
        Level1.setLuigi("WaveDash");
        Level1.setToad("Poison");
        Level1.setWaro("Gold");
        Level1.setBowser("Fireballs");
        Level1.setYoshi("Flutter");
        Level1.setPeach("Turnip");
        Level1.setDaisy("Flower attack");
        Level1.setRosalina("Luma spin attack");
        Level1.setGoomba("Stomp");
        Level1.setCoins(0);
        Level1.setTotalStars(0);
        Level1.setHealth(100);
        Level1.setPlayTime(0);
        Level1.setPlayerType("Human");
        Level1.setPlayerBuild("Melee");

        System.out.println(Level1.getPlayerName()
                + ", each partner character in the mushroom kingdom has their own specific ability");

        System.out.println("Marios ability is " + Level1.getMario());
        System.out.println("Luigis ability is " + Level1.getLuigi());
        System.out.println("Toads ability is " + Level1.getToad());
        System.out.println("Warios ability is " + Level1.getWario());
        System.out.println("Bowsers ability is " + Level1.getBowser());
        System.out.println("Yoshis ability is " + Level1.getYoshi());
        System.out.println("Peachs ability is " + Level1.getPeach());
        System.out.println("Daisys ability is " + Level1.getDaisy());
        System.out.println("Rosalinas ability is " + Level1.getRosalina());
        System.out.println("Goombas ability is " + Level1.getGoomba());
        System.out.println();
        System.out.println(Level1.getPlayerName() + ", your current build is " + Level1.getPlayerBuild());

        System.out.println("Finding coins will also allow you to upgrade your build and partners ability.");

        boolean validAttack = false;

        while (!validAttack) {
            System.out.println("Here " + Level1.getPlayerName()
                    + ", use your Melee attack to break this box in front of you using 'v'");

            String MeleeAttack = userInput.nextLine();

            if (MeleeAttack.equals("v") || MeleeAttack.equals("V")) {
                validAttack = true;
                System.out.println("OOOMPF");
                System.out.println(Level1.getPlayerName() + " you broke the box");
                System.out.println("1 coin has been added to your inventory.");
                Level1.setPlayTime(0);
            } else {
                System.out.println("Try attacking the box with 'v' ");
            }
        }

    }
}