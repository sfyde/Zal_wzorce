package creatrional;

import creatrional.products.Engine;
import creatrional.products.Suspension;
import creatrional.products.Breaks;

public interface Factory {

    Engine mountEngine();
    Suspension mountSuspension();
    Breaks mountBreaks();
}
