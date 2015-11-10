package task3;

import java.util.ArrayList;
import java.util.List;

public class Game {
  private List<Question> questions = new ArrayList<>();
  private List<String> answers = new ArrayList<>();
  private int i = 0;

  public void addQuestion(String q, String answ1, String answ2, String answ3, String answ4, String correctAnsw) {
    questions.add(new Question(q, answ1, answ2, answ3, answ4));
    answers.add(correctAnsw);
  }

  public Question getNextQuestion() {
    if (i != questions.size()) {
      return questions.get(i++);
    } else {
      return null;
    }
  }

  public boolean checkAnswer(Question q, String answer) {
    return answers.get(questions.indexOf(q)).equals(answer);
  }
}
