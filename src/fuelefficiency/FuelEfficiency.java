/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;
 import java.util.Scanner;
/**
 *
 * @author jabal3175
 */
public class FuelEfficiency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarations
        
        
        double fuel;
        
        Truck litres = new Truck();
        Car litres1  = new Car();
        Motorcycle litres2 = new Motorcycle();
        HybridCar litres3  = new HybridCar();
        
        //Scanner constructor
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many litres of fuel do you need for your car?");
        fuel = sc.nextDouble();
        
        /**
         * End result of the program is printed
         */
        
        System.out.println("On "+fuel+"L of gas, the vehicles can drive:");
        System.out.println("Truck = "+litres.getDistance(fuel)+"km");
        System.out.println("Car = "+litres1.getDistance(fuel)+"km");
        System.out.println("Hybrid Car = "+litres3.getDistance(fuel)+"km");
        System.out.println("Motorcycle = "+litres2.getDistance(fuel)+"km");
    }
    
}
