/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coches;

/**
 *
 * @author Estudio
 */
public class Carros {

    private String marca;
    private String anio;
    private String precio;
    private String km;
    private String color;
    private String modelo;
    private String stock;
    private String tipo;
    private String transmision;
    private String ruedas;
    
    public Carros(String marca, String anio, String precio, String km, String color, String modelo, String stock, String tipo, String transmision, String ruedas) {
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;
        this.km = km;
        this.color = color;
        this.modelo = modelo;
        this.stock = stock;
        this.tipo = tipo;
        this.transmision = transmision;
        this.ruedas = ruedas;
    }
    
   

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getRuedas() {
        return ruedas;
    }

    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }
    
    
    
    public Object[] toArray(){
        Object obj[] = new Object[10];
        obj[0] = marca;
        obj[1] = anio;
        obj[2] = precio;
        obj[3] = km;
        obj[4] = color;
        obj[5] = modelo;
        obj[6] = stock;
        obj[7] = tipo;
        obj[8] = transmision;
        obj[9] = ruedas;
        return obj;
    } 
    
}
