package entity;

public class HolidayStockExchange extends Entity{
    private final int holidayId;
    private final int stockExchangeId;

    public HolidayStockExchange(int holidayId, int stockExchangeId) {
        this.holidayId = holidayId;
        this.stockExchangeId = stockExchangeId;
    }

    @Override
    public String generateSQLString() {
        return String.format("INSERT INTO holiday_stock_exchange (holiday_id, stock_exchange) VALUES ('%s', '%s');", holidayId, stockExchangeId);
    }
}
