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
public class Car extends Vehicle{
    
    //private double f;
    private double dist;
    
    public Car()
    {
       super();
    }
    
    
    /**
     * 
     * @param lit
     * @return dist
     */
   
    public double  getDistance(double lit)
    {
       
        
        dist = lit/9.4*100;
        
        
        return dist;
    }
}
