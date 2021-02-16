/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nowe.modelo;

/**
 *
 * @author Ricardo
 */
public class Material {
    
    //Atrivutos
    private int idmaterial;
    private String nombre;
    private String descripcion;
    private double volumen;
    
    //Metodos
    @Override
    public String toString() {
        return "Material{" + "idmaterial=" + idmaterial + ", nombre=" + nombre + ", descripcion=" + descripcion + ", volumen=" + volumen + '}';
    }
    
    //Constructores
    public Material() {
    }

    public Material(String nombre, String descripcion, double volumen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.volumen = volumen;
    }

    public Material(int idmaterial, String nombre, String descripcion, double volumen) {
        this.idmaterial = idmaterial;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.volumen = volumen;
    }
    
    //Setters y Getters

    public int getIdmaterial() {
        return idmaterial;
    }

    public void setIdmaterial(int idmaterial) {
        this.idmaterial = idmaterial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    
}
