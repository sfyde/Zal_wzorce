package creatrional.factorys.RedBull;

import creatrional.Factory;
import creatrional.products.Breaks;
import creatrional.products.Engine;
import creatrional.products.Suspension;

public class RedBullFactory implements Factory {
    @Override
    public Engine mountEngine() {
        return new RedBullEngine();
    }

    @Override
    public Suspension mountSuspension() {
        return new RedBullSuspension();
    }

    @Override
    public Breaks mountBreaks() {
        return new RedBullBreaks();
    }
}
