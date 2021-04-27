package entity;

public class Client extends Entity{
    private final String name;
    private final String surname;
    private final String birthDate;

    public Client(String name, String surname, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String generateSQLString(){
        return String.format("INSERT INTO client (name, surname, birth_date) VALUES ('%s', '%s', '%s');", name, surname, birthDate);
    }
}
