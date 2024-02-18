package behavioral;

public class Main {
    public static void main(String[] args) {
        Season23 season23 = new Season23();
        Season22 season22 = new Season22();
        Season21 season21 = new Season21();

        SeasonList seasonlist = new SeasonList (season23, season22, season21);
        seasonlist.showTeams();
    }
}
