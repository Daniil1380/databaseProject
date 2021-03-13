package entity;

public class Broker extends Entity{
    String name;
    String country;
    boolean state;


    public Broker(String name, String country, boolean state) {
        this.name = name;
        this.country = country;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String generateSQLString() {
        return String.format("INSERT INTO broker (name, country, state) VALUES ('%s', '%s', '%s');", name, country, state);
    }
}
