package generators.simpleGenerators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RateGenerator implements Generator {
    private final Random random;

    public RateGenerator(Random random) {
        this.random = random;
    }

    @Override
    public List<String> generate(int elements) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            list.add(random.nextInt(2) == 1 ? "Трейдер" : "Инвестор");
        }
        return list;
    }
}
