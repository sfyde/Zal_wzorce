package behavioral;

public class Team {
    private final String name;

    private final Driver driver1;

    private final Driver driver2;

    private final int points;

    private final int position;

    public Team(String name, Driver driver1, Driver driver2, int points, int position) {
        this.name = name;
        this.driver1 = driver1;
        this.driver2 = driver2;
        this.points = points;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getDriver1() {
        return driver1.getName();
    }

    public Driver getDriver2() {
        return driver2;
    }

    public int getPoints() {
        return points;
    }

    public int getPosition() {
        return position;
    }
}
