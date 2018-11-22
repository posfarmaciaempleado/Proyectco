package com.jram.navwebjavaswing.entity;

/**
 * @version 1.0
 * @author JavierT
 */
public class Documentacion {
   
    //Atributos de la clase Documentacion
    private String url;
    private String descripcion;

    /*
    * Constructores:
    * El primer constructor solo servira para instancial la clase
    * El segundo constructor servira para poder agregar los datos al ArrayList
    */
    public Documentacion() {
    }

    public Documentacion(String url, String descripcion) {
        this.url = url;
        this.descripcion = descripcion;
    }

    //Metodos Getters & Setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Url: " + url + ", Descripcion: " + descripcion;
    }
    
}
