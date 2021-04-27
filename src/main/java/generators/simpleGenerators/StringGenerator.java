package generators.simpleGenerators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringGenerator implements Generator {
    private final Random random;
    private final List<String> input;

    public StringGenerator(Random random, List<String> input) {
        this.random = random;
        this.input = input;
    }

    @Override
    public List<String> generate(int elements) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            list.add(input.get(random.nextInt(input.size())));
        }
        return list;
    }
}
