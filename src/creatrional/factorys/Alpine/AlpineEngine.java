package creatrional.factorys.Alpine;

import creatrional.products.Engine;

public class AlpineEngine implements Engine {
    @Override
    public void showParametrs() {
        System.out.println("Alpine Engine: HorsePower: 400hp Points: 10");
    }
}
