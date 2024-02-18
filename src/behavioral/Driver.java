package behavioral;

import static java.lang.Character.toUpperCase;

public class Driver {

    private String name;

    private String surname;

    public Driver(String name, String surname) {
        this.name = name;
        this.surname =surname;
    }

    public String getName() {
        String completeName = toUpperCase(name.charAt(0)) +"." + surname;
        return completeName;
    }

}
