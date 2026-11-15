/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class BikeDelivery extends Delivery {

    public BikeDelivery(String trackingId, int distanceKm) {
        super(trackingId, distanceKm);//Referencia 
    }

    

    @Override
    protected int ratePerKm() {
        return 8;
    }
    

}
