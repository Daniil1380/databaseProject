package entity;

public class Share extends Entity{
    private final String name;
    private final int stockExchangeId;
    private final double cost;
    private final int count;


    public Share(String name, int stockExchangeId, double cost, int count) {
        this.name = name;
        this.stockExchangeId = stockExchangeId;
        this.cost = cost;
        this.count = count;
    }

    @Override
    public String generateSQLString() {
        return String.format("INSERT INTO share (name, stock_exchange_id, cost, count) VALUES ('%s', '%s', '%s', '%s');", name, stockExchangeId, cost, count);
    }
}
