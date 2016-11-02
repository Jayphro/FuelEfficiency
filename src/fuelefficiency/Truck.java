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
public class Truck extends Vehicle{
    
    public double dist;
    
    
    
    
    public Truck()
    {
         super();
    }
    
    public double getDistance(double lit)
    {
        dist = lit/14.1*100;
        return dist;
    }
}
