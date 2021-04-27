package entity;

public class Broker extends Entity{
    private final String name;
    private final String country;
    private final boolean state;


    public Broker(String name, String country, boolean state) {
        this.name = name;
        this.country = country;
        this.state = state;
    }

    @Override
    public String generateSQLString() {
        return String.format("INSERT INTO broker (name, country, state) VALUES ('%s', '%s', '%s');", name, country, state);
    }
}
