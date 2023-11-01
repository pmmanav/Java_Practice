package gross_calculator;

import java.util.Random;

public class RollTheDie {
    public static void main(String[] args) {
        int curPosition  =  0;
        Random random = new Random();
        for(int i=0; i < 5; i++){
            int rolledDice = random.nextInt(1, 6);
            curPosition = curPosition + rolledDice;
            int moreToGo = 20 - curPosition;
            System.out.println("Roll #" + i + ": You've rolled a " + rolledDice + ". You are now on space "+ curPosition + " and have " + moreToGo + " more to go.");
        }
        if(curPosition >= 20)
        {
            System.out.println("Congrats! You win. You are on " + curPosition + ".");
        }
        else{
            System.out.println("You Failed");
        }
    }
}
