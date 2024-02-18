package creatrional;

import creatrional.factorys.Alpine.AlpineFactory;
import creatrional.factorys.Mercedes.MercedesFactory;
import creatrional.products.Breaks;
import creatrional.products.Engine;
import creatrional.products.Suspension;

public class Main {
    public static void main(String[] args) {
        Factory factory = new MercedesFactory();
        App example = new App(factory);
        example.show();
    }
}
