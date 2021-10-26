/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.*;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Reserva {
    private String fecha_inicio;
    private String fecha_salida;
    private ArrayList<Parcela> parcelasDispo = new ArrayList();
    private ArrayList<Parcela> parcelasReservadas = new ArrayList();
    private Cliente cliente;
    
    public Reserva(String fecha_inicio, String fecha_salida, ArrayList<Parcela> parcelasDispo, ArrayList<Parcela> parcelasReservadas, Cliente cliente){
        this.fecha_inicio = fecha_inicio;
        this.fecha_salida = fecha_salida;
        this.parcelasDispo = parcelasDispo;
        this.parcelasReservadas = parcelasReservadas;
        this.cliente = cliente;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Parcela> getParcelasReservadas() {
        return parcelasReservadas;
    }

    public void setParcelasReservadas(ArrayList<Parcela> parcelasReservadas) {
        this.parcelasReservadas = parcelasReservadas;
    }
    
}
