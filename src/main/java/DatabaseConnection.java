import entity.Entity;
import generators.MainGenerator;
import java.io.IOException;
import java.sql.*;
import java.util.List;

public class DatabaseConnection {
    public static void main(String[] args) throws SQLException, IOException {
        MainGenerator mainGenerator = new MainGenerator();
        //можно сделать ввод чисел с консоли через Scanner, но это все же не пользовательская программа,
        //поэтому оставил так
        List<Integer> countList = List.of(10, 10, 10, 10, 10, 10, 10, 10, 10);
        List<List<Entity>> list = mainGenerator.generate(countList);
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/investing",
                "postgres", "root")){
            Statement statement = connection.createStatement();
            for (List<Entity> entities : list) {
                for (Entity entity : entities) {
                     statement.execute(entity.generateSQLString());
                }
            }
        }
    }
}
