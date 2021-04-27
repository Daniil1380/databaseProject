package generators.entityGenerators;

import entity.Entity;
import entity.Rate;
import generators.simpleGenerators.RateGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RateEntityGenerator implements EntityGenerator {
    private final Random random;


    public RateEntityGenerator(Random random) {
        this.random = random;
    }

    @Override
    public List<Entity> generate(int elements) {
        RateGenerator rateEntityGenerator = new RateGenerator(random);
        List<String> rates = rateEntityGenerator.generate(elements);
        List<Entity> list = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            Rate rate = new Rate(rates.get(i), random.nextDouble(), random.nextInt(1000), random.nextInt(elements) + 1);
            list.add(rate);
        }
        return list;
    }
}
