/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.dp.allmycircuits.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Этот класс запускает все описанное безобразие
 * @author winkiller
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //создаем список и заполняем его потомками базового класса Vehicle
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(Vehicle.createVehicle(VehicleType.CAR));
        vehicles.add(Vehicle.createVehicle(VehicleType.BOAT));
        vehicles.add(Vehicle.createVehicle(VehicleType.PLANE));
        vehicles.add(Vehicle.createVehicle(null));
        //А теперь по очереди у каждого дергаем метод info()
        for(Vehicle v: vehicles){
            v.info();
        }
    }
}
