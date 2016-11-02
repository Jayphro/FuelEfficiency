/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

/**
 *
 * @author jabal3175
 */
public abstract class Vehicle {
    
   
    private double dist;
    
    /**
     * Default constructor for vehicle.
     */
    public Vehicle()
    {
    
    }
    
    
    //abstract getDistance method
    public abstract double getDistance(double lit);
    
}
