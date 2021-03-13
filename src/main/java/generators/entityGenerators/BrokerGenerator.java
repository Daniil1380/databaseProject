package generators.entityGenerators;

import configuration.Config;
import entity.Broker;
import entity.Entity;
import generators.simpleGenerators.StringGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BrokerGenerator implements EntityGenerator {
    Random random;

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public BrokerGenerator(Random random) {
        this.random = random;
    }

    @Override
    public List<Entity> generate(int elements) {
        List<Entity> list = new ArrayList<>();
        StringGenerator brokerGenerator = new StringGenerator(random, Config.BROKERS);
        StringGenerator countryGenerator = new StringGenerator(random, Config.COUNTRIES);
        List<String> name = brokerGenerator.generate(elements);
        List<String> country = countryGenerator.generate(elements);
        for (int i = 0; i < elements; i++) {
            Broker broker = new Broker(name.get(i), country.get(i), random.nextBoolean());
            list.add(broker);
        }
        return list;
    }
}
