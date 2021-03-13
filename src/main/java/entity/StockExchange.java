package entity;

public class StockExchange extends Entity{
    String name;
    String territory;
    String currency;
    String dayStart;
    String dayEnd;


    public StockExchange(String name, String territory, String currency, String dayStart, String dayEnd) {
        this.name = name;
        this.territory = territory;
        this.currency = currency;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    @Override
    public String generateSQLString() {
        return String.format("INSERT INTO stock_exchange (name, territory, currency) VALUES ('%s', '%s', '%s');", name, territory, currency);
    }
}
