package creatrional.factorys.RedBull;

import creatrional.products.Engine;

public class RedBullEngine implements Engine {
    @Override
    public void showParametrs() {
        System.out.println("Redbull Engine: HorsePower: 450hp Points: 15");
    }
}
