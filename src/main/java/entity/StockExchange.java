package entity;

public class StockExchange extends Entity{
    private final String name;
    private final String territory;
    private final String currency;
    private final String dayStart;
    private final String dayEnd;


    public StockExchange(String name, String territory, String currency, String dayStart, String dayEnd) {
        this.name = name;
        this.territory = territory;
        this.currency = currency;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
    }

    @Override
    public String generateSQLString() {
        return String.format("INSERT INTO stock_exchange (name, territory, currency) VALUES ('%s', '%s', '%s');", name, territory, currency);
    }
}
