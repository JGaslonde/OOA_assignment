import java.util.*;

public class cardGame implements GameInterface {

  public void play(RandomInterface rng) {

    ArrayList<String> deck = cardGame.shuffle(cardGame.generateDeck(), rng);
    cardGame.chooseCards(deck, rng);
  }

	public static ArrayList<String> generateDeck() {

		String cards[]={"AHrts", "2Hrts", "3Hrts", "4Hrts", "5Hrts", "6Hrts",
                      "7Hrts", "8Hrts", "9Hrts", "10Hrts", "JHrts",
                      "QHrts", "KHrts",
                      "ADmnds", "2Dmnds", "3Dmnds", "4Dmnds", "5Dmnds",
                      "6Dmnds", "7Dmnds", "8Dmnds", "9Dmnds", "10Dmnds",
                      "JDmnds", "QDmnds", "KDmnds",
                      "ASpds", "2Spds", "3Spds", "4Spds", "5Spds", "6Spds",
                      "7Spds", "8Spds", "9Spds", "10Spds", "JSpds",
                      "QSpds", "KSpds",
                      "AClbs", "2Clbs", "3Clbs", "4Clbs", "5Clbs", "6Clbs",
                      "7Clbs", "8Clbs", "9Clbs", "10Clbs", "JClbs",
                      "QClbs", "KClbs"};

        ArrayList<String> deck = new ArrayList<String> (Arrays.asList(cards));
        return deck;
	}

	public static ArrayList<String> shuffle(ArrayList cardList, RandomInterface rng) {		

		for (int i=0; i<100; i++) {
      // choose two random cards at random and swap them, 100 times
      int firstIndex=((int) (rng.next() * 52));
      int secondIndex=((int) (rng.next() * 52));

      String temp=(String) cardList.get(firstIndex);
      cardList.set(firstIndex, cardList.get(secondIndex));
      cardList.set(secondIndex, temp); 
    }

    System.out.println(cardList);
    return cardList;
	}

	public static void chooseCards(ArrayList<String> cardList, RandomInterface rng){

		HashSet<String> cards = new HashSet<String>();

		for (int i=0; i<2; i++) {
			InputHandling.nextLn("choose a card");
      int cardChoice=(int) (rng.next() * cardList.size());
      System.out.println("You chose " + cardList.get(cardChoice));
      cards.add(cardList.remove(cardChoice));
    }

   	System.out.println("Cards chosen: " + cards);
   	System.out.println("Remaining cards: " + cardList);

   	if (cards.contains("AHrts") || cards.contains("ADmnds") ||
      cards.contains("ASpds") || cards.contains("AClbs")) {
      System.out.println("You won!");
    } 
    else System.out.println("You lost!");
	}
}