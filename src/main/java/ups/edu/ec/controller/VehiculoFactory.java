/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.controller; 

import ups.edu.ec.model.VehiculoAuto;
import ups.edu.ec.model.VehiculoCamioneta;
import ups.edu.ec.model.VehiculoCamion; 
import ups.edu.ec.model.Vehiculo;

/**
 *
 * @author Mauricio Ortiz
 */
public class VehiculoFactory extends VehiculoAbstractFactory{

    @Override
    public Vehiculo crearVehiculoFactory(String tipoVehiculo) {
         switch (tipoVehiculo) {
            case "AUTO" -> {
                return new VehiculoAuto();
            }
            case "CAMION" -> {
                return new VehiculoCamion();
            }
            case "CAMIONETA" -> {            
                return new VehiculoCamioneta();
            }
                
            default -> throw new IllegalArgumentException("Parámetro inválido");
        }
    } 
}
