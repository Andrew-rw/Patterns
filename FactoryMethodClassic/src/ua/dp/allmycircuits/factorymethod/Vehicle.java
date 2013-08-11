/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.dp.allmycircuits.factorymethod;

/**
 * Базовый класс с фабричным методом
 * @author winkiller
 */
public class Vehicle {
    /**
     * Метод будет информировать нас о действиях экземпляра класса. У каждого потомка действие будет свое.
     */
    public void info(){
        System.out.println("This is base class");
    }
    /**
     * Фабричный метод
     * @param type на вход передаем тип
     * @return 
     */
    public static Vehicle createVehicle(VehicleType type){
        Vehicle ret;
        // для пущего изврата, можно определение написать с помощью рефлексии. Можно и switch использовать, только учесть что type может быть null
        if(type == VehicleType.BOAT){
            ret = new Boat();
        }else if(type == VehicleType.CAR){
            ret = new Car();
        }else if(type == VehicleType.PLANE){
            ret = new Plane();
        }else{
            ret = new Vehicle();
        }
        return ret;
    }
    
}
