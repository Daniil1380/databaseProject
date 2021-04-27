package generators.entityGenerators;

import configuration.Config;
import entity.Entity;
import entity.StockExchange;
import generators.simpleGenerators.StringGenerator;
import generators.simpleGenerators.TimeGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockExchangeGenerator implements EntityGenerator{
    private final Random random;

    public StockExchangeGenerator(Random random) {
        this.random = random;
    }

    @Override
    public List<Entity> generate(int elements) {
        TimeGenerator startTime = new TimeGenerator(random, 0, 12);
        TimeGenerator endTime = new TimeGenerator(random, 13, 23);
        StringGenerator currencyGenerator = new StringGenerator(random, Config.CURRENCIES);
        StringGenerator countryGenerator = new StringGenerator(random, Config.COUNTRIES);
        StringGenerator stockGenerator = new StringGenerator(random, Config.STOCKS);
        List<String> territory = countryGenerator.generate(elements);
        List<String> currency = currencyGenerator.generate(elements);
        List<String> dayStart = startTime.generate(elements);
        List<String> dayEnd = endTime.generate(elements);
        List<String> name = stockGenerator.generate(elements);
        List<Entity> list = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            StockExchange stockExchange = new StockExchange(name.get(i), territory.get(i), currency.get(i), dayStart.get(i), dayEnd.get(i));
            list.add(stockExchange);
        }
        return list;
    }
}
