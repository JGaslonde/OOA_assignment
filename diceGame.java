import java.util.*;

public class diceGame implements GameInterface {

  public void play(RandomInterface rng){

    diceGame.rollDice(rng);
  }

	public static void rollDice(RandomInterface rng){

		HashSet<Integer> numbersRolled=new HashSet<Integer>();
    for (int i=0; i<2; i++) {
     	InputHandling.nextLn("roll the die");
      int dieRoll=(int)(rng.next() * 6) + 1;
      System.out.println("You rolled " + dieRoll);
      numbersRolled.add(new Integer(dieRoll));
    }

    // Display the numbers rolled
    System.out.println("Numbers rolled: " + numbersRolled);

    // Now see if (s)he has won!
    if (numbersRolled.contains(new Integer(1))) {
      System.out.println("You won!");
    }
    else System.out.println("You lost!");
	}
}