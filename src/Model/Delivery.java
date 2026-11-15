
package Model;
import Model.Chargeable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Mena
 */
public abstract class Delivery implements Chargeable {

    private String trackingId;
    private int distanceKm;

    public Delivery(String trackingId, int distanceKm) {
        this.trackingId = trackingId;
        this.distanceKm = distanceKm;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public int getDistanceKm() {
        return distanceKm;
    }
    
    
    
    public int baseCharge() {
        return 40;
    }

    protected abstract int ratePerKm();

    @Override
    public String label() {
        return "Envio a domicilio";
    }

    @Override
    public int calculateCharge() {
        return baseCharge() + distanceKm * ratePerKm();
    }

}
