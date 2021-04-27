package entity;

public class Rate extends Entity{
    private final String name;
    private final double commission;
    private final int cost;
    private final int brokerId;

    public Rate(String name, double commission, int cost, int brokerId) {
        this.name = name;
        this.commission = commission;
        this.cost = cost;
        this.brokerId = brokerId;
    }

    @Override
    public String generateSQLString() {
        return String.format("INSERT INTO rate (name, commission, cost, broker_id) VALUES ('%s', '%s', '%s', '%s');", name, commission, cost, brokerId);
    }
}
