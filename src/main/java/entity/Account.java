package entity;

public class Account extends Entity{
    int brokerId;
    double cash;
    boolean margin;
    int rateId;
    int clientId;

    public Account(int brokerId, double cash, boolean margin, int rateId, int clientId) {
        this.brokerId = brokerId;
        this.cash = cash;
        this.margin = margin;
        this.rateId = rateId;
        this.clientId = clientId;
    }

    public int getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(int brokerId) {
        this.brokerId = brokerId;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public boolean isMargin() {
        return margin;
    }

    public void setMargin(boolean margin) {
        this.margin = margin;
    }

    public int getRateId() {
        return rateId;
    }

    public void setRateId(int rateId) {
        this.rateId = rateId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public String generateSQLString() {
        return String.format("INSERT INTO account (broker_id, cash, margin, rate_id, client_id) VALUES (%s, %s, %s, %s, %s);", brokerId, cash, margin, rateId, clientId);
    }
}
