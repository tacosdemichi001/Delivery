/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.BikeDelivery;
import Model.Chargeable;
import Model.Packaging;
import Model.VanDelivery;
import java.util.ArrayList;

/**
 *
 * @author Mena
 */
public class ChargeableController {

    private ArrayList<Chargeable> chargeables;

    public ChargeableController() {
        chargeables = new ArrayList<>();
    }

    public ArrayList<Chargeable> getChargeables() {
        return chargeables;
    }

    public void registrarBikeDelivery(String trackingId, int distanceKm) {
        BikeDelivery bikeDelivery = new BikeDelivery(trackingId, distanceKm);//el ultimo lo debe tomar de la interfaz
        chargeables.add(bikeDelivery); //Agrega el registro al ArrayList chargeable

    }

    public void registrarVanDelivery(String trackingId, int distanceKm) {
        VanDelivery vanDelivery = new VanDelivery(trackingId, distanceKm);//el ultimo lo debe tomar de la interfaz
        chargeables.add(vanDelivery);
    }

    public void registrarPackaging(int items, int chargePerItem) {
        Packaging packaging = new Packaging(items, chargePerItem);//Esto lo debe de tomar de la interfaz
        chargeables.add(packaging);
    }

    public double calcularTotalGeneral() {

        double total = 0;

        for (Chargeable elemento : chargeables) { //for-each
            total = total + elemento.calculateCharge();
        }
        return total;
    }

}
