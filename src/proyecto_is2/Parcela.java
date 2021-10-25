/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_is2;

/**
 *
 * @author danie
 */
public class Parcela {
    private int id;
    private int metros_cuadrados;
    private boolean luz;
    private int precio;
    
    public Parcela(int id, int metros_cuadrados, boolean luz, int precio){
        this.id = id;
        this.metros_cuadrados = metros_cuadrados;
        this.luz = luz;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMetros_cuadrados() {
        return metros_cuadrados;
    }

    public void setMetros_cuadrados(int metros_cuadrados) {
        this.metros_cuadrados = metros_cuadrados;
    }

    public boolean getLuz() {
        return luz;
    }

    public void setLuz(boolean luz) {
        this.luz = luz;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}























