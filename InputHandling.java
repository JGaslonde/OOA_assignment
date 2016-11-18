import java.util.*;

public class InputHandling {

	public static int inputValidation(){
		Scanner input = new Scanner(System.in);
		System.out.println("(c)ard or (d)ice game?");
		while(!input.hasNext("[cCdD]")){
			System.out.println("Please enter (c)ard or (d)ice game!");
			input.next();
		}

		if (input.hasNext("[cC]")){
			return 1;
		} else {
			return 0;
		}
	}

	public static void nextLn(String prompt) {
		Scanner input = new Scanner(System.in);
		System.out.println("Press <RETURN> to " + prompt);
		input.nextLine();
	}

}