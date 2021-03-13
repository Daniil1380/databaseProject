import entity.Entity;
import generators.MainGenerator;
import generators.entityGenerators.*;
import jsonEntity.PersonNames;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.Random;

public class DatabaseConnection {
    public static void main(String[] args) throws SQLException, IOException {
        MainGenerator mainGenerator = new MainGenerator();
        List<List<Entity>> list = mainGenerator.generate(1);

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
