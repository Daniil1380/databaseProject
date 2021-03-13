package generators;

import jsonEntity.PersonNames;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class JSONParser {
    ObjectMapper mapper;

    public JSONParser(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    private String readJson(File file){
        try {
            String jsonString = FileUtils.readFileToString(file, "UTF-8");
            jsonString = correctJSON(jsonString);
            return correctJSON(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public PersonNames[] parseNames(File file) throws JsonProcessingException {
        String jsonString = readJson(file);
        return mapper.readValue(jsonString, PersonNames[].class);
    }

    private String correctJSON(String jsonString){
        return jsonString.trim().replaceFirst("\ufeff", "");
    }
}
