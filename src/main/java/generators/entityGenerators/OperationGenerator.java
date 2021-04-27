package generators.entityGenerators;

import entity.Entity;
import entity.Operation;
import generators.simpleGenerators.BuySellGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OperationGenerator implements EntityGenerator{
    private final Random random;

    public OperationGenerator(Random random) {
        this.random = random;
    }

    @Override
    public List<Entity> generate(int elements) {
        List<Entity> list = new ArrayList<>();
        BuySellGenerator buySellGenerator = new BuySellGenerator(random);
        List<String> buySells = buySellGenerator.generate(elements);
        for (int i = 0; i < elements; i++) {
            Operation operation = new Operation(random.nextInt(elements)+1, random.nextInt(elements)+1, random.nextInt(10000), buySells.get(i));
            list.add(operation);
        }
        return list;
    }
}
