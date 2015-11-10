/**
 * 
 */
package task3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author Sergey Krivohatskiy
 *
 */
public class GameAndQuestionTest {
    @Test(expected = IllegalArgumentException.class)
    public void questionInvalidCorrectTest() {
	Question q = new Question("q", "a1", "a2", "a3", "a4", -1);
    }

    @Test
    public void questionCheckAnswerTest() {
	Question q = new Question("q", "a1", "a2", "a3", "a4", 1);
	assertFalse(q.checkAnswer(0));
	assertTrue(q.checkAnswer(1));
	assertFalse(q.checkAnswer(2));
	assertFalse(q.checkAnswer(3));
    }

    @Test
    public void emptyGameReturnsNoQuestionsTest() {
	Game game = new Game();
	assertNull(game.getNextQuestion());
    }

    @Test
    public void gameWithSingleQuestionTest() {
	Game game = new Game();
	Question q = new Question("q", "a1", "a2", "a3", "a4", 1);
	game.addQuestion(q);
	assertNotNull(game.getNextQuestion());
	assertNull(game.getNextQuestion());
    }
}
