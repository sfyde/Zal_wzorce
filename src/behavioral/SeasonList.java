package behavioral;

import java.util.Iterator;

public class SeasonList {

    private final TeamIterator season23;
    private final TeamIterator season22;
    private final TeamIterator season21;
    public SeasonList(TeamIterator season23, TeamIterator season22, TeamIterator season21) {
        this.season23 = season23;
        this.season22 = season22;
        this.season21 = season21;
    }
    public void showTeams() {
        showTeamsInfo(this.season23.createIterator());
        showTeamsInfo(this.season22.createIterator());
        showTeamsInfo(this.season21.createIterator());
    }

    private void showTeamsInfo(Iterator<Team> iterator){
        while (iterator.hasNext()){
            showTeamInfo(iterator.next());
        }
        System.out.println();
    }
    private void showTeamInfo(Team team){
        System.out.println("Name: " + team.getName());
        System.out.println("Driver One: " + team.getDriver1());
        System.out.println("Driver Two: " + team.getDriver2());
        System.out.println("Points: " + team.getPoints());
        System.out.println("Position: " + team.getPosition());
        System.out.println();
    }
}
