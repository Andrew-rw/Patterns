/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.dp.allmycircuits.factorymethod;

import java.util.ArrayList;
import java.util.List;
import ua.dp.allmycircuits.factorymethod.Vehicle;

/**
 *
 * @author winkiller
 */
public class FactoryMethodClassic {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //инициируем фабрики. Можно в цикле инициировать. Боже, храни полиморфизм!
        BoatFactory bf = new BoatFactory();
        CarFactory cf = new CarFactory();
        PlaneFactory pf = new PlaneFactory();
        
        //создаем список и заполняем его потомками базового класса Vehicle
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(bf.createVehicle());
        vehicles.add(cf.createVehicle());
        vehicles.add(pf.createVehicle());
        
        //А теперь по очереди у каждого дергаем метод info()
        for(Vehicle v: vehicles){
            v.info();
        }
    }    
}
