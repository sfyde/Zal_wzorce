package structural;

import static java.lang.Character.toUpperCase;

public class DriverAdapter extends Team {

    private final Driver driver;

    public DriverAdapter (Driver driver) {
        this.driver = driver;
    }

    @Override
    public String getName() {
        return toUpperCase(this.driver.getName().charAt(0)) +"." + this.driver.getSurname().substring(0,3);
    }

    @Override
    public String getPoints() {
        return Integer.toString(this.driver.getPoints());
    }
}
