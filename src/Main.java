import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String aMove = "";
        String bMove = "";
        String playAgain = "";
        String aTrash;
        String bTrash;
        String playTrash;
        Scanner in = new Scanner(System.in);
        boolean aDone = false;
        boolean bDone = false;
        boolean playDone = false;
        boolean trashDone = false;
        do {
            playDone = false;
            do {
                aDone = false;
                System.out.print("Enter a move for player A (R,S,P): ");
                aMove = in.next();
                if (aMove.equalsIgnoreCase("R")) {
                    aDone = true;
                } else if (aMove.equalsIgnoreCase("S")) {
                    aDone = true;
                } else if (aMove.equalsIgnoreCase("P")) {
                    aDone = true;
                } else {
                    aTrash = in.next();
                    System.out.println("Must enter a valid move: " + aTrash + "\n");
                }
            }
            while (!aDone);
            System.out.println("Player A selected: " + aMove);
            do {
                bDone = false;
                System.out.print("Enter a move for player B (R,S,P): ");
                bMove = in.next();
                if (bMove.equalsIgnoreCase("R")) {
                    bDone = true;
                } else if (bMove.equalsIgnoreCase("S")) {
                    bDone = true;
                } else if (bMove.equalsIgnoreCase("P")) {
                    bDone = true;
                } else {
                    bTrash = in.next();
                    System.out.println("Must enter a valid move: " + bTrash + "\n");
                }
            }
            while (!bDone);
            System.out.println("Player B selected: " + bMove);
            if (!aMove.equalsIgnoreCase("r") && !bMove.equalsIgnoreCase("s")) {
                System.out.println("Rock breaks scissors: Player A wins");
            } else if (!aMove.equalsIgnoreCase("s") && !bMove.equalsIgnoreCase("p")) {
                System.out.println("Scissors cuts paper: Player A wins");
            } else if (!aMove.equalsIgnoreCase("p") && !bMove.equalsIgnoreCase("r")) {
                System.out.println("Paper covers rock: Player A wins");
            } else if (!aMove.equalsIgnoreCase("r") && !bMove.equalsIgnoreCase("p")) {
                System.out.println("Paper covers rock: Player B wins");
            } else if (!aMove.equalsIgnoreCase("s") && !bMove.equalsIgnoreCase("r")) {
                System.out.println("Rock breaks scissors: Player B wins");
            } else if (!aMove.equalsIgnoreCase("p") && !bMove.equalsIgnoreCase("s")) {
                System.out.println("Scissors cuts paper: Player B wins");
            } else {
                System.out.println("Both players chose the same move: tie");
            }
            System.out.print("Would you like to try again (Y,N): ");
            do {
                trashDone = false;
                playAgain = in.next();
                if (playAgain.equalsIgnoreCase("N")) {
                    playDone = true;
                    trashDone = true;
                }
                else if (playAgain.equalsIgnoreCase("Y")) {
                    trashDone = true;
                }
                else {
                    playTrash = in.next();
                    System.out.println("Must enter a valid answer: " + playTrash + "\n");
                    System.out.print("Would you like to try again (Y,N): ");
                }
            }
            while (!trashDone);
        }
        while (!playDone);
        System.out.println("Thank you for playing.");
    }
}