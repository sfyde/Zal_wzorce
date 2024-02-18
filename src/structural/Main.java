package structural;

public class Main {
    public static void main(String[] args) {
        Driver hamilton = new Driver("lewis", "Hamilton", 20);
        Team merc = new Team("Mercedes", "50");

        Result result = new Result();

        DriverAdapter driverAdapter = new DriverAdapter(hamilton);

        result.getInfo(merc);
        result.getInfo(driverAdapter);
    }
}
