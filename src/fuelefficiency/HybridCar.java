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
public class HybridCar extends Vehicle {
      private double dist;
      
      
      public HybridCar()
      {
          super();
         
      }
      
      
      public double getDistance(double lit)
      {
           
           dist = lit/3.8*100;
           return dist;
      }
    
    
}
