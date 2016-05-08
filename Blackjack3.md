# blackjack
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;


public class Blackjack3 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int[] newCard = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};

        shuffleArray(newCard);

        System.out.println("Welcome to BlackJack!");
        System.out.println();
        System.out.print("What is your name?");
        String name = keyboard.next();
        System.out.println();
        
        
        int money;   
        int bet;         
        boolean userWins; 

        System.out.println("Welcome to the game of blackjack.");
        System.out.println();

        money = 100; 
        while (true)
        {
            System.out.println("You have " + money + " dollars.");
            do
            {
                System.out.println("How many dollars do you want to bet?  (Enter 0 to end.)");
                System.out.print("? ");
                bet = keyboard.nextInt();
                if (bet < 0 || bet > money)
                {
                    System.out.println("Your answer must be between 0 and " + money + '.');
                }
            } while (bet < 0 || bet > money);
            if (bet == 0)
            {
                break;
            }
            userWins = playBlackjack();
            if (userWins)
            {
                money = money + bet;
            } else
            {
                money = money - bet;
            }
            System.out.println();
            if (money == 0)
            {
                System.out.println("Looks like you've are out of money!");
                break;
            }
        }

        System.out.println();
        System.out.println("You leave with $" + money + '.');

        private boolean playBlackjack(String name) {
        
        System.out.println(name + " get a " + newCard[0] + " and a " + newCard[1] + ".");
        int playerTotal = newCard[0] + newCard[1];
        System.out.println(name + " total is " + playerTotal + ".");
        System.out.println();

        if (playerTotal == 21){
            System.out.println("Blackjack, you win.");
            System.exit(0);
        }
        if (playerTotal > 21){
            System.out.println("You lose.");
            System.exit(0);
        }
        System.out.println("The dealer has a " + newCard[2] + " showing, and a hidden card.");
        int dealerTotal = newCard[2] + newCard[3];
        if (dealerTotal > 21){ 
            System.out.println();
            System.out.println("Dealers total is " + dealerTotal + ".");
            System.out.println("Dealer is bust, you win!");
            System.exit(0);
        }
        if (dealerTotal == 21){ 
            System.out.println();
            System.out.println("Dealer reveals his second card: " + newCard[3] + ".");
            System.out.println("Dealers total is " + dealerTotal + ".");
            System.out.println();
            System.out.println("Dealer has BlackJack, you lose.");
            System.exit(0);
        }
        System.out.println("His total is hidden.");
        System.out.println();


        System.out.print("Would you like to \"hit\" or \"stay\"? ");
        String hitStay = keyboard.next();
        System.out.println();

        int cc = 4; 
        if (hitStay.equalsIgnoreCase("hit")){
   
            while (playerTotal < 21 && hitStay.equalsIgnoreCase("hit")){
                if (hitStay.equalsIgnoreCase("hit")){
                    System.out.println("You drew a " + newCard[cc] + ".");
                    playerTotal = playerTotal + newCard[cc];
                    System.out.println("Your total is " + playerTotal + ".");
                    System.out.println();
                    cc++; 
                    if (playerTotal > 21){
                        System.out.println("You are bust, You lose.");
                        System.exit(0);
                    }
                    if (playerTotal == 21){
                        System.out.println("Blackjack, you win.");
                        System.exit(0);
                    }
                    System.out.print("Would you like to \"hit\" or \"stay\"? ");
                    hitStay = keyboard.next();
                    System.out.println();
                }
            }        
        }
        keyboard.close();
        System.out.println("Ok dealers turn.");
        System.out.println("His hidden card was a " + newCard[3] + ".");

        cc++;
        while (dealerTotal < 16){
            System.out.println();
            System.out.println("Dealer chooses to hit.");
            System.out.println("He draws a " + newCard[cc] + ".");
            cc++;
            dealerTotal = dealerTotal + newCard[cc];
            System.out.println();
            System.out.println("His total is " + dealerTotal);
            if (dealerTotal > 21){
                System.out.println();
                System.out.println("Dealer is bust, YOU WIN!");
                System.exit(0);
            }
            if (dealerTotal < 21 && dealerTotal > 16){
                System.out.println();
                System.out.println("Dealer Stays.");
            }
        }

        System.out.println();
        System.out.println("Dealer total is " + dealerTotal);
        System.out.println("Your total is " + playerTotal);
        System.out.println();

        if (dealerTotal > playerTotal){
            System.out.println("Dealer wins.");
        } 
        if (dealerTotal == playerTotal){
            System.out.println("You both draw.");
        }
        if (dealerTotal < playerTotal){
            System.out.println("You win.");
        }
    }
        return;
    }

    static void shuffleArray(int[] deckCards){

        Random rnd = new Random();
        for (int i = deckCards.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            int a = deckCards[index];
            deckCards[index] = deckCards[i];
            deckCards[i] = a;
        }
    }
}
