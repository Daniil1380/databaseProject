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

     public List<List<Entity>> generate(List<Integer> countList) throws JsonProcessingException {
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


         list.add(clientGenerator.generate(countList.get(0)));
         list.add(brokerGenerator.generate(countList.get(1)));
         list.add(holidayGenerator.generate(countList.get(2)));
         list.add(rateEntityGenerator.generate(countList.get(3)));
         list.add(accountGenerator.generate(countList.get(4)));
         list.add(stockExchangeGenerator.generate(countList.get(5)));
         list.add(shareGenerator.generate(countList.get(6)));
         list.add(holidayStockExchangeGenerator.generate(countList.get(7)));
         list.add(operationGenerator.generate(countList.get(8)));

         return list;
     }
}
