/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.dp.allmycircuits.factorymethod;

/**
 *
 * @author winkiller
 */
public class CarFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
    
}
