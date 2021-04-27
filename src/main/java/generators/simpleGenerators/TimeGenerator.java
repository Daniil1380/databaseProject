package generators.simpleGenerators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TimeGenerator implements Generator {
    private final Random random;
    private final int end;
    private final int start;

    public TimeGenerator(Random random, int start, int end) {
        this.random = random;
        this.start = start;
        this.end = end;
    }

    @Override
    public List<String> generate(int elements) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            int hours = random.nextInt(end-start)+start;
            int minutes = random.nextInt(60);
            int seconds = random.nextInt(60);
            stringBuilder.append(hours);
            stringBuilder.append(":");
            stringBuilder.append(minutes);
            stringBuilder.append(":");
            stringBuilder.append(seconds);
            list.add(stringBuilder.toString());
        }
        return list;

    }
}
