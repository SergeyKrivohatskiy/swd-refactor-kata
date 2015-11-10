package task3;

public class Question {
    public final String question;
    public final String[] answers;
    private final int correct;

    public Question(String q, String a1, String a2, String a3, String a4,
	    int correct) {
	this.question = q;
	answers = new String[4];
	answers[0] = a1;
	answers[1] = a2;
	answers[2] = a3;
	answers[3] = a4;
	if (correct >= answers.length || correct < 0) {
	    throw new IllegalArgumentException(
		    "Correct should be in range from 0 to answers count - 1");
	}
	this.correct = correct;
    }

    public boolean checkAnswer(int answer) {
	return correct == answer;
    }
}
