package generators.entityGenerators;

import configuration.Config;
import entity.Entity;
import entity.Share;
import generators.simpleGenerators.StringGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShareGenerator implements EntityGenerator{
    Random random;

    public ShareGenerator(Random random) {
        this.random = random;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public List<Entity> generate(int elements) {
        StringGenerator shareGenerator = new StringGenerator(random, Config.SHARES);
        List<String> shares = shareGenerator.generate(elements);
        List<Entity> list = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            Share share = new Share(shares.get(i), random.nextInt(elements)+1, random.nextDouble(), random.nextInt());
            list.add(share);
        }
        return list;
    }
}
