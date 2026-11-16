/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Mena
 */
public class Packaging implements Chargeable { //Clase hija de la clase interface "Chargeable"
    
    private int items;
    private int chargePerItem;

    public Packaging(int items, int chargePerItem) {
        this.items = items;
        this.chargePerItem = chargePerItem;
    }
    
    
    
    @Override //sobreescribe los métodos heredados por su clase padre
    public String label() {
        return "Empaque del pedido";
    }

    @Override
    public int calculateCharge() {
        return items * chargePerItem;
        
    }

    
    
}
