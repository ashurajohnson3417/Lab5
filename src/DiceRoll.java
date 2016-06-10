import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
	public static double autoRandom(double setRoll){
		setRoll = Math.random() * 100/10;
		return (int)setRoll;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean go = false;
		while (!go){
			System.out.println("Welcome! Roll the dice? Y or N?");
			String play = input.nextLine();
				if (play.equalsIgnoreCase("y")) {
					System.out.println("Please enter 2-10; the amount of the sides you want your die to have.");
					int dieSides = input.nextInt();
					System.out.println("The die is currently rolling....");
					//Random rand = new Random();
					//int rolling = rand.nextInt(dieSides) + 1;
					//int rolling1 = rand.nextInt(dieSides) + 1;
					System.out.println(autoRandom(dieSides));
					System.out.println(autoRandom(dieSides));
						/*if(dieSides+dieSides == 7 || dieSides+dieSides==11){
							System.out.println("Craps!");
						}else if (dieSides+dieSides==2){
							System.out.println("Snake eyes!");
						}else{
							continue;}*/
					System.out.println("Play again? Y or N?");
					input.nextLine();
					String playAgain = input.nextLine();
							if(!playAgain.equalsIgnoreCase("y")){
							System.out.println("Exiting");
							go = true;
							}
				} else{
					System.out.println("See you later!");
					break;
				}
		
		}
	}
}

				
		
