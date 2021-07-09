import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class GameOfDice {
    public static void main(String[] args){
        // Week 1 Challenge - Game of Dice
    /* Pseudocode code
    BEGIN
	Welcome the user

	start: do while loop
		create random number 1
		create random number 2
		print : random number 1 and random number 2
			if both number 1 and number 2 equal to 1
				then score should be + 25
			else if either number 1 or number 2 equal to 1
				then score equals to 0
			else
				then add score and number 1 and number 2

		print: total score

		ask the user "roll again"
	end loop: if the user responded no to "roll again" or score is over 100

	if score is over 100
		then let the user know and print thank you msg
	else
		print: thank you msg

    END
     */

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int score = 0;
        String response;

        System.out.println("Welcome! Let's Play Roll Dice!");

        do {
            int dice1 = rand.nextInt(6) + 1;
            int dice2 = rand.nextInt(6) + 1;
            System.out.println("Your rolls " + dice1 + " & " + dice2);
                if (dice1 == 1 && dice2 == 1) {
                    score = score + 25;
                }else if (dice1 ==1 || dice2 == 1){
                    score = score;
                }else{
                    score = score + dice1 + dice2;
                }
            System.out.println("Score: " + score);
            System.out.println();
            System.out.print("Roll again? ");
            response = input.next().toLowerCase(Locale.ROOT);
        }while((response.charAt(0) == 'y') && (score <= 100));

        if (score > 100)
            System.out.println( "You have scored over 100\n" +
                                "Thank you for playing!");
        else
            System.out.println("Thank you for playing!");

    }
}
