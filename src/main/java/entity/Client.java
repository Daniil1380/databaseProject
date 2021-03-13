package entity;

public class Client extends Entity{
    String name;
    String surname;
    String birthDate;

    public String getName() {
        return name;
    }

    public Client(String name, String surname, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String generateSQLString(){
        return String.format("INSERT INTO client (name, surname, birth_date) VALUES ('%s', '%s', '%s');", name, surname, birthDate);
    }
}
