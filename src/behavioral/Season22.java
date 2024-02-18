package behavioral;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Season22 implements TeamIterator{

    private final Map<Integer, Team> constractorTable;
    private int key =0;

    public Season22(){
        this.constractorTable = new HashMap<>();

        this.addTeam("Mercedes", new Driver("Lewis", "Hamilton"),new Driver("George", "Russell"),769,1 );
        this.addTeam("Redbull", new Driver("Max", "Verstapen"),new Driver("Sergio", "Perez"),690,2 );
        this.addTeam("Ferrari", new Driver("Charl", "Leclerc"),new Driver("Carlos", "Sainz"),380,3 );

    }

    public void addTeam(String name, Driver driver1, Driver driver2, int points, int position) {
        Team team = new Team(name, driver1, driver2, points, position);
        this.constractorTable.put(key, team);
        key++;
    }

    @Override
    public Iterator<Team> createIterator() {
        return this.constractorTable.values().iterator();
    }
}

