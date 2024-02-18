package creatrional.factorys.Mercedes;

import creatrional.products.Engine;

public class MercedesEngine implements Engine {
    @Override
    public void showParametrs() {
        System.out.println("Mercedes Engine: HorsePower: 430hp Points: 12");
    }
}
