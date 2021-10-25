/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_is2;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Registro {
    private String fecha_inicio;
    private String fecha_salida;
    private ArrayList<Parcela> parcelasDispo = new ArrayList();
    private ArrayList<Parcela> parcelasReservadas = new ArrayList();
    private Cliente cliente;
    private String nombreTiendaCampanya;
    private String tamanyoTiendaCampanya;
    private int precio;

    public Registro(String fecha_inicio, String fecha_salida, Cliente cliente, String nombreTiendaCampanya, String tamanyoTiendaCampanya, int precio) {
        this.fecha_inicio = fecha_inicio;
        this.fecha_salida = fecha_salida;
        this.cliente = cliente;
        this.nombreTiendaCampanya = nombreTiendaCampanya;
        this.tamanyoTiendaCampanya = tamanyoTiendaCampanya;
        this.precio = precio;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public ArrayList<Parcela> getParcelasDispo() {
        return parcelasDispo;
    }

    public void setParcelasDispo(ArrayList<Parcela> parcelasDispo) {
        this.parcelasDispo = parcelasDispo;
    }

    public ArrayList<Parcela> getParcelasReservadas() {
        return parcelasReservadas;
    }

    public void setParcelasReservadas(ArrayList<Parcela> parcelasReservadas) {
        this.parcelasReservadas = parcelasReservadas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNombreTiendaCampanya() {
        return nombreTiendaCampanya;
    }

    public void setNombreTiendaCampanya(String nombreTiendaCampanya) {
        this.nombreTiendaCampanya = nombreTiendaCampanya;
    }

    public String getTamanyoTiendaCampanya() {
        return tamanyoTiendaCampanya;
    }

    public void setTamanyoTiendaCampanya(String tamanyoTiendaCampanya) {
        this.tamanyoTiendaCampanya = tamanyoTiendaCampanya;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
    
}
