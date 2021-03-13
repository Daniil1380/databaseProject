package generators;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Entity;
import generators.entityGenerators.*;
import jsonEntity.PersonNames;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainGenerator {

     public List<List<Entity>> generate(int n) throws JsonProcessingException {
         List<List<Entity>> list = new ArrayList<List<Entity>>();
         JSONParser jsonParser = new JSONParser(new ObjectMapper());

         File fileSurnames = new File("src/main/resources/russian_surnames.json");
         PersonNames[] personSurnames = jsonParser.parseNames(fileSurnames);
         File fileNames = new File("src/main/resources/russian_names.json");
         PersonNames[] personNames = jsonParser.parseNames(fileNames);
         Random random = new Random();

         ClientGenerator clientGenerator = new ClientGenerator(personNames, personSurnames, random);
         BrokerGenerator brokerGenerator = new BrokerGenerator(random);
         HolidayGenerator holidayGenerator = new HolidayGenerator();
         RateEntityGenerator rateEntityGenerator = new RateEntityGenerator(random);
         AccountGenerator accountGenerator = new AccountGenerator(random);
         StockExchangeGenerator stockExchangeGenerator = new StockExchangeGenerator(random);
         ShareGenerator shareGenerator = new ShareGenerator(random);
         HolidayStockExchangeGenerator holidayStockExchangeGenerator = new HolidayStockExchangeGenerator(random);
         OperationGenerator operationGenerator = new OperationGenerator(random);


         list.add(clientGenerator.generate(n));
         list.add(brokerGenerator.generate(n));
         list.add(holidayGenerator.generate(n));
         list.add(rateEntityGenerator.generate(n));
         list.add(accountGenerator.generate(n));
         list.add(stockExchangeGenerator.generate(n));
         list.add(shareGenerator.generate(n));
         list.add(holidayStockExchangeGenerator.generate(n));
         list.add(operationGenerator.generate(n));

         return list;
     }
}
