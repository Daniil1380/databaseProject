package generators.simpleGenerators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BuySellGenerator implements Generator {
    private final Random random;

    public BuySellGenerator(Random random) {
        this.random = random;
    }

    @Override
    public List<String> generate(int elements) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            list.add(createRandomBuySell());
        }
        return list;
    }

    private String createRandomBuySell() {
        return random.nextInt(2) == 0 ? "b" : "s";
    }
}
