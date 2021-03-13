package generators.entityGenerators;

import entity.Entity;
import entity.Holiday;
import generators.simpleGenerators.DateGenerator;

import java.util.ArrayList;
import java.util.List;

public class HolidayGenerator implements EntityGenerator{

    @Override
    public List<Entity> generate(int elements) {
        DateGenerator holidayGenerator = new DateGenerator(0, 365);
        List<String> days = holidayGenerator.generate(elements);
        List<Entity> list = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            Holiday holiday = new Holiday(days.get(i));
            list.add(holiday);
        }
        return list;
    }
}
