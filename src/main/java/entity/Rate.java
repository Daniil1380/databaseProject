package entity;

public class Rate extends Entity{
    String name;
    double commission;
    int cost;
    int brokerId;

    public Rate(String name, double commission, int cost, int brokerId) {
        this.name = name;
        this.commission = commission;
        this.cost = cost;
        this.brokerId = brokerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(int brokerId) {
        this.brokerId = brokerId;
    }

    @Override
    public String generateSQLString() {
        return String.format("INSERT INTO rate (name, commission, cost, broker_id) VALUES ('%s', '%s', '%s', '%s');", name, commission, cost, brokerId);
    }
}
