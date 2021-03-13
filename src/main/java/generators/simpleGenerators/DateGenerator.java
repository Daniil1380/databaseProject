package generators.simpleGenerators;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DateGenerator implements Generator {
    int start;
    int length;

    public DateGenerator(int start, int length) {
        this.start = start;
        this.length = length;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public List<String> generate(int elements) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            list.add(createRandomDate(start, length));
        }
        return list;
    }

    private String createRandomDate(int start, int length){
        Random r = new Random();
        LocalDate date = LocalDate.now().minusDays(r.nextInt(length)+start);
        String[] birthDate = date.toString().split("-");
        return birthDate[2] + '.' + birthDate[1] + '.' + birthDate[0];
    }
}
