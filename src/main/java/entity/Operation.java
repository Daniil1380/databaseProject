package entity;

public class Operation extends Entity{
    int clientId;
    int shareId;
    int count;
    String buySell;

    public Operation(int clientId, int shareId, int count, String buySell) {
        this.clientId = clientId;
        this.shareId = shareId;
        this.count = count;
        this.buySell = buySell;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getShareId() {
        return shareId;
    }

    public void setShareId(int shareId) {
        this.shareId = shareId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getBuySell() {
        return buySell;
    }

    public void setBuySell(String buySell) {
        this.buySell = buySell;
    }

    @Override
    public String generateSQLString() {
        return String.format("INSERT INTO operation (client_id, share_id, count, buy_sell) VALUES ('%s', '%s', '%s', '%s');", clientId, shareId, count, buySell);
    }
}
