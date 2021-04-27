package entity;

public class Account extends Entity{
    private final int brokerId;
    private final double cash;
    private final boolean margin;
    private final int rateId;
    private final int clientId;

    public Account(int brokerId, double cash, boolean margin, int rateId, int clientId) {
        this.brokerId = brokerId;
        this.cash = cash;
        this.margin = margin;
        this.rateId = rateId;
        this.clientId = clientId;
    }

    @Override
    public String generateSQLString() {
        return String.format("INSERT INTO account (broker_id, cash, margin, rate_id, client_id) VALUES (%s, %s, %s, %s, %s);", brokerId, cash, margin, rateId, clientId);
    }
}
