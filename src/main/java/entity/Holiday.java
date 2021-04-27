package entity;

public class Holiday extends Entity{
    private final String day;

    public Holiday(String day) {
        this.day = day;
    }

    @Override
    public String generateSQLString() {
        return String.format("INSERT INTO holiday (day) VALUES ('%s')", day);
    }
}
