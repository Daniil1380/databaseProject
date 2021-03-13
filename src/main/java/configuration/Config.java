package configuration;

import java.util.List;

public class Config {

    public final static List<String> BROKERS;
    public final static List<String> COUNTRIES;
    public final static List<String> CURRENCIES;
    public final static List<String> STOCKS;
    public final static List<String> SHARES;


    static {
        BROKERS = List.of("Тинькофф",
                "ВТБ",
                "СБЕР",
                "ФИНАМ",
                "ФГ БКС",
                "Фридом Финанс",
                "Открытие Брокер",
                "АТОН",
                "Алор");

        COUNTRIES = List.of("Россия",
                "Германия",
                "США",
                "Китай",
                "Франция",
                "Великобритания",
                "Китай",
                "Индия",
                "Япония");

        CURRENCIES = List.of("Рубль",
                "Евро",
                "Доллар",
                "Юань");

        STOCKS = List.of("Шанхай",
                "Санкт_Петербургская_биржа",
                "NY_stock",
                "California_stock");

        SHARES = List.of("Тинькофф",
                "ВТБ",
                "СБЕР",
                "ЭНЕЛ",
                "JD",
                "APPLE",
                "TESLA",
                "IT TECH ETF",
                "FINEX ETF");
    }

}
