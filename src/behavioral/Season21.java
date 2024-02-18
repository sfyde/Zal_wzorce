package behavioral;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Season21 implements TeamIterator{

    private final List<Team> constractorTable;


    public Season21(){
        this.constractorTable = new ArrayList<>();

        this.addTeam("Redbull", new Driver("Max", "Verstapen"),new Driver("Sergio", "Perez"),860,1 );
        this.addTeam("Mercedes", new Driver("Lewis", "Hamilton"),new Driver("George", "Russell"),409,2 );
        this.addTeam("Ferrari", new Driver("Charl", "Leclerc"),new Driver("Carlos", "Sainz"),406,3 );
    }

    public void addTeam(String name, Driver driver1, Driver driver2, int points, int position) {
        Team team = new Team(name, driver1, driver2, points, position);

        this.constractorTable.add(team);
    }
        @Override
        public Iterator<Team> createIterator() {
            return this.constractorTable.iterator();
        }
    }

