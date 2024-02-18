package creatrional;

import creatrional.products.Breaks;
import creatrional.products.Engine;
import creatrional.products.Suspension;

public class App {
    private Engine engine;
    private Suspension suspension;
    private Breaks breaks;


    public App(Factory factory){
        engine = factory.mountEngine();
        suspension = factory.mountSuspension();
        breaks = factory.mountBreaks();
    }

    public void show(){
        engine.showParametrs();
        suspension.showParametrs();
        breaks.showParametrs();
    }
}
