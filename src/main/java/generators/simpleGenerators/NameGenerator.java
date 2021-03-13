package generators.simpleGenerators;

import jsonEntity.PersonNames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NameGenerator implements Generator {
    PersonNames[] persons;
    int maxSize;
    Random random;

    public NameGenerator(PersonNames[] persons, int maxSize, Random random) {
        this.persons = persons;
        this.maxSize = maxSize;
        this.random = random;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public PersonNames[] getPersons() {
        return persons;
    }

    public void setPersons(PersonNames[] persons) {
        this.persons = persons;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<String> generate(int elements){
        if (maxSize<3) maxSize=3;
        List<String> list = new ArrayList<>();
        int i = 0;
        while (elements>0){
            i = random.nextInt(persons.length);
            String name = persons[i].name;
            if (name.length() <= maxSize) {
                list.add(name);
                elements--;
            }
        }
        Collections.shuffle(list);
        return list;
    }

}
