package creatrional.factorys.Mercedes;

import creatrional.products.Suspension;

public class MercedesSuspension implements Suspension {
    @Override
    public void showParametrs() {
        System.out.println("Mercedes Suspension: Stiffness: V.Hard, Points: 10");
    }
}
