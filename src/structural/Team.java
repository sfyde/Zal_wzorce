package structural;

public class Team {

    private String name;
    private String points;

    public Team(String name, String points) {
        this.name = name;
        this.points = points;
    }

    public Team() {
    }

    public String getName() {
        return name;
    }

    public String getPoints() {
        return points;
    }
}
