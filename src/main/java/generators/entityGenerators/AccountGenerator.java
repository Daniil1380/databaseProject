package generators.entityGenerators;

import entity.Account;
import entity.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AccountGenerator implements EntityGenerator{
    private final Random random;

    public AccountGenerator(Random random) {
        this.random = random;
    }

    public Random getRandom() {
        return random;
    }

    @Override
    public List<Entity> generate(int elements) {
        List<Entity> list = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            Account account = new Account(random.nextInt(elements)+1, random.nextDouble(), random.nextBoolean(), random.nextInt(elements)+1, random.nextInt(10)+1);
            list.add(account);
        }
        return list;
    }
}
