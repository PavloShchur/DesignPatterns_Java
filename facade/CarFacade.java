package com.pavlo.facade;

public class CarFacade {

    private Door door = new Door();
    private Zazhiganie zazhiganie = new Zazhiganie();
    private Wheel wheel = new Wheel();
    
    public void go(){
        door.open();
        zazhiganie.fire();
        wheel.turn();
    }
    
        
    
}
