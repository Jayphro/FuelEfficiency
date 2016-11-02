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
public class Motorcycle {
    private double dist;
    
    
    public Motorcycle()
    {
        super();
    }
    
    
    public double getDistance(double lit)
    {
        dist = lit/6.3*100;
        return dist;
    }
}

