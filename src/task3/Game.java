package task3;

import java.util.LinkedList;
import java.util.Queue;

public class Game {
    private Queue<Question> questions = new LinkedList<>();

    public void addQuestion(Question q) {
	questions.add(q);
    }

    public Question getNextQuestion() {
	return questions.poll();
    }
}
