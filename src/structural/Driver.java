package structural;

public class Driver {
    private String name;
    private String surname;
    private Integer points;

    public Driver(String name, String surname, Integer points) {
        this.name = name;
        this.surname = surname;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getPoints() {
        return points;
    }
}
