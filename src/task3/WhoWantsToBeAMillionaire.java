package task3;

import java.util.Scanner;

/**
 * Simplify and make Game API more robust where possible
 */
public class WhoWantsToBeAMillionaire {
    public static void main(String[] args) {
	Game game = new Game();
	game.addQuestion(new Question("What is the Capital of Great Britain?",
		"Paris", "Karaganda", "Dublin", "London", 3));
	game.addQuestion(new Question("Who is the author of Godfather novel?",
		"Hemingway", "Puzo", "Vonnegut", "Tolstoy", 1));
	game.addQuestion(new Question("What is the distance to the Moon?",
		"156 000 km", "384 000 km", "432 000 km", "521 000 km", 1));

	try (Scanner scanner = new Scanner(System.in)) {
	    for (Question q = game.getNextQuestion(); q != null; q = game
		    .getNextQuestion()) {
		System.out.println(q.question);
		for (int idx = 0; idx < q.answers.length; idx += 1) {
		    System.out.println(Integer.toString(idx + 1) + ". "
			    + q.answers[idx]);
		}

		int playerGuess = scanner.nextInt();
		if (!q.checkAnswer(playerGuess - 1)) {
		    throw new RuntimeException("You failed!");
		}
		System.out.println("Correct!");
	    }
	}

	System.out.println("Take your Million!");
    }
}
