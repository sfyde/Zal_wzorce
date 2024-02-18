package creatrional.factorys.Mercedes;

import creatrional.Factory;
import creatrional.products.Breaks;
import creatrional.products.Engine;
import creatrional.products.Suspension;

public class MercedesFactory implements Factory {
    @Override
    public Engine mountEngine() {
        return new MercedesEngine();
    }

    @Override
    public Suspension mountSuspension() {
        return new MercedesSuspension();
    }

    @Override
    public Breaks mountBreaks() {
        return new MercedesBreaks();
    }
}
