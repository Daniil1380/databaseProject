package entity;

public class Operation extends Entity{
    private final int clientId;
    private final int shareId;
    private final int count;
    private final String buySell;

    public Operation(int clientId, int shareId, int count, String buySell) {
        this.clientId = clientId;
        this.shareId = shareId;
        this.count = count;
        this.buySell = buySell;
    }

    @Override
    public String generateSQLString() {
        return String.format("INSERT INTO operation (client_id, share_id, count, buy_sell) VALUES ('%s', '%s', '%s', '%s');", clientId, shareId, count, buySell);
    }
}
