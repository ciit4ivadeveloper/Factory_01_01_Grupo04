/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.controller;
 
import ups.edu.ec.model.Vehiculo;

/**
 *
 * @author c.idrovo
 */
public abstract class VehiculoAbstractFactory {

     public abstract Vehiculo crearVehiculoFactory(String tipoVehiculo);
    
}
