package magicEightBall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Raffle {
    private List<Answers> answers;
    private Random randomGenerator;

    public Raffle() {
        answers = new ArrayList<Answers>(Arrays.asList(Answers.values()));
        randomGenerator = new Random();
    }

    public String eightBall() {
        int index = randomGenerator.nextInt(answers.size());
        return answers.get(index).getMessage();
    }
}
