package entity;

public class Share extends Entity{
    String name;
    int stockExchangeId;
    double cost;
    int count;


    public Share(String name, int stockExchangeId, double cost, int count) {
        this.name = name;
        this.stockExchangeId = stockExchangeId;
        this.cost = cost;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStockExchangeId() {
        return stockExchangeId;
    }

    public void setStockExchangeId(int stockExchangeId) {
        this.stockExchangeId = stockExchangeId;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String generateSQLString() {
        return String.format("INSERT INTO share (name, stock_exchange_id, cost, count) VALUES ('%s', '%s', '%s', '%s');", name, stockExchangeId, cost, count);
    }
}
