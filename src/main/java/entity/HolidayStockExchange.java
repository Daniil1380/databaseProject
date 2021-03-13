package entity;

public class HolidayStockExchange extends Entity{
    int holidayId;
    int stockExchangeId;

    public HolidayStockExchange(int holidayId, int stockExchangeId) {
        this.holidayId = holidayId;
        this.stockExchangeId = stockExchangeId;
    }

    public int getHolidayId() {
        return holidayId;
    }

    public void setHolidayId(int holidayId) {
        this.holidayId = holidayId;
    }

    public int getStockExchangeId() {
        return stockExchangeId;
    }

    public void setStockExchangeId(int stockExchangeId) {
        this.stockExchangeId = stockExchangeId;
    }

    @Override
    public String generateSQLString() {
        return String.format("INSERT INTO holiday_stock_exchange (holiday_id, stock_exchange) VALUES ('%s', '%s');", holidayId, stockExchangeId);
    }
}
