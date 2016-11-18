public class Game {
	
	public static void main(String[] args) {
		RandomInterface rng = new LinearCongruentialGenerator();
		Factory f = new Factory();
		GameInterface chosenGame = f.getGame(InputHandling.inputValidation());
		chosenGame.play(rng);
		
		
		
		
	}
}