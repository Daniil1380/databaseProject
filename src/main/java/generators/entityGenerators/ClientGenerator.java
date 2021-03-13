package generators.entityGenerators;

import entity.Client;
import entity.Entity;
import generators.simpleGenerators.DateGenerator;
import generators.simpleGenerators.NameGenerator;
import jsonEntity.PersonNames;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClientGenerator implements EntityGenerator{

    PersonNames[] personNames;
    PersonNames[] personSurnames;
    Random random;

    public ClientGenerator(PersonNames[] personNames, PersonNames[] personSurnames, Random random) {
        this.personNames = personNames;
        this.personSurnames = personSurnames;
        this.random = random;
    }

    public PersonNames[] getPersonNames() {
        return personNames;
    }

    public void setPersonNames(PersonNames[] personNames) {
        this.personNames = personNames;
    }

    public PersonNames[] getPersonSurnames() {
        return personSurnames;
    }

    public void setPersonSurnames(PersonNames[] personSurnames) {
        this.personSurnames = personSurnames;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public List<Entity> generate(int elements) {
        NameGenerator firstNameGenerator = new NameGenerator(personNames, 10, random);
        NameGenerator surnameGenerator = new NameGenerator(personSurnames, 10, random);
        DateGenerator dateGenerator = new DateGenerator(10000, 10000);
        List<String> names = firstNameGenerator.generate(elements);
        List<String> surnames = surnameGenerator.generate(elements);
        List<String> birthDate = dateGenerator.generate(elements);
        List<Entity> list = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            Client client = new Client(names.get(i), surnames.get(i), birthDate.get(i));
            list.add(client);
        }
        return list;
    }
}
