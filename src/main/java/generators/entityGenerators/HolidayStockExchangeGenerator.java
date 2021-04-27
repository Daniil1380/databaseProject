package generators.entityGenerators;

import entity.Entity;
import entity.HolidayStockExchange;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HolidayStockExchangeGenerator implements EntityGenerator{
    private final Random random;

    public HolidayStockExchangeGenerator(Random random) {
        this.random = random;
    }

    @Override
    public List<Entity> generate(int elements) {
        List<Entity> list = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            HolidayStockExchange holidayStockExchange = new HolidayStockExchange(random.nextInt(elements)+1, random.nextInt(elements)+1);
            list.add(holidayStockExchange);
        }
        return list;
    }
}
