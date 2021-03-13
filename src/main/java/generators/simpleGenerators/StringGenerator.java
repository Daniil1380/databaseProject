package generators.simpleGenerators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringGenerator implements Generator {
    Random random;
    List<String> input;

    public List<String> getInput() {
        return input;
    }

    public void setInput(List<String> input) {
        this.input = input;
    }

    public Random getRandom() {
        return random;
    }

    public StringGenerator(Random random, List<String> input) {
        this.random = random;
        this.input = input;
    }

    public void setRandom(Random random) {
        this.random = random;
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
