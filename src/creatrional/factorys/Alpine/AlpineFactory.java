package creatrional.factorys.Alpine;

import creatrional.Factory;
import creatrional.products.Breaks;
import creatrional.products.Engine;
import creatrional.products.Suspension;

public class AlpineFactory implements Factory {

    @Override
    public Engine mountEngine() {
        return new AlpineEngine();
    }

    @Override
    public Suspension mountSuspension() {
        return new AlpineSuspension();
    }

    @Override
    public Breaks mountBreaks() {
        return new AlpineBreaks();
    }
}
