package generators.entityGenerators;

import entity.Entity;

import java.util.List;

public interface EntityGenerator {
    List<Entity> generate(int elements);
}
