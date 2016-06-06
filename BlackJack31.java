import java.util.Random;
import java.util.Scanner;
public class BlackJack31{
  
  public static void main(String[] args){   
    Scanner in = new Scanner(System.in);
    int[] newCard = {1,2,3,4,5,6,7,8,9,10,10,10,10,10};

    shuffleArray(newCard);
    
    int human_total = play_human();
    int computer_total = play_computer();
    calculate_winner(human_total,computer_total);
      }

  public static int play_human(){
    Scanner in = new Scanner(System.in);
    System.out.print("What is your name?");
    String name = keyboard.next();
    System.out.print("How much do you have?");
    Int money = keyboard.next();
    while(Ture){
       System.out.println("You have " + money + " dollars.");
       System.out.println("How many dollars do you want to bet?");
       bet = keyboard.nextInt();
                if (bet < 0 || bet > money)
                {
                    System.out.println("please check your money again. Your money=" + money + );
                }
            } while (bet < 0 || bet > money);
            if (bet == 0)
            {
                break;
            }
            humanWins = play_human;
            if (human_win)
            {
                money = money + bet;
            } else
            {
                money = money - bet;
            }
            System.out.println();
            if (money == 0)
            {
                System.out.println("No money");
                break;
            }
        }

        System.out.println("You leave " + money );
    }
    System.out.println(name + " get a " + newCard[0]  + newCard[1]);
    int playerTotal = newCard[0] + newCard[1];
    System.out.println(name + " total is " + playerTotal + ".");
    System.out.println();
      for(int i =1 ; i <2 ; ++i){
      System.out.println("Do you want another card (Y/N)");
      String s = in.nextLine();
      if(s.equals("Y")){
        human_total = human_total +  newCard[2];
        System.out.println("new human_total "+human_total);
      }
      if(s.equals("N")){
        break;
      }
      if(human_total>21){
        break; 
      }
    }
    return play_human;
  }
  
   public static int play_computer(){
    Scanner in = new Scanner(System.in);
    int computer_total =  newCard[3] + newCard[4];
    System.out.println("Computer player got");
    System.out.println(computer_card1+" and "+computer_card2);
    return computer_total;
  }
  
  public static void calculate_winner(String name, int human_total, int computer_total){
    if(human_total<=21 && computer_total<human_total){
      System.out.println(name+" Wins");
    }
    else {
      System.out.println("Computer Wins");
    }
    return play_human
  }
  