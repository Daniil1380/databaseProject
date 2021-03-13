package entity;

public class Holiday extends Entity{
    String day;

    public Holiday(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String generateSQLString() {
        return String.format("INSERT INTO holiday (day) VALUES ('%s')", day);
    }
}
