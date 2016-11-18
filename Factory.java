public class Factory {

	public GameInterface getGame(int ans){

		if(ans == 1) {
			return new cardGame();
		} else {
			return new diceGame();
		}
	}
}