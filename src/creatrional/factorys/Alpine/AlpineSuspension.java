package creatrional.factorys.Alpine;

import creatrional.products.Suspension;

public class AlpineSuspension implements Suspension {
    @Override
    public void showParametrs() {
        System.out.println("Alpine Suspension: Stiffness: Hard, Points: 14");
    }
}
