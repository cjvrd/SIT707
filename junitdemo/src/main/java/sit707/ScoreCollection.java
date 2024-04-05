package sit707;

import java.util.*;

public class ScoreCollection {
    private List<Scorable> scores = new ArrayList<>();

    public void add(Scorable scorable) {
        scores.add(scorable);
    }

    public int arithmeticMean() {
        int total = scores.stream().mapToInt(Scorable::getScore).sum();
        return total / scores.size();
    }
}
