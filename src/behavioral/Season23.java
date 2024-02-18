package behavioral;

import java.util.Arrays;
import java.util.Iterator;

public class Season23 implements TeamIterator  {

        private final Team[] constractorTable;

        private int key = 0;
        public Season23() {
            this.constractorTable = new Team[3];

            this.addTeam("Mercedes", new Driver("Lewis", "Hamilton"),new Driver("George", "Russell"),769,1 );
            this.addTeam("Redbull", new Driver("Max", "Verstapen"),new Driver("Sergio", "Perez"),690,2 );
            this.addTeam("Ferrari", new Driver("Charl", "Leclerc"),new Driver("Carlos", "Sainz"),380,3 );
        }

    public void addTeam(String name, Driver driver1, Driver driver2, int points, int position) {
        Team team = new Team(name, driver1, driver2, points, position);
            this.constractorTable[key]= team;
            key++;
        }

        @Override
        public Iterator<Team> createIterator() {
            return Arrays.asList(this.constractorTable).iterator();
        }
}