package com.example.crudfirebase;

public class MainModel {
    String nombre, apellido, email, imgURL;

    public MainModel() {
    }

    public MainModel(String nombre, String apellido, String email, String imgURL) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.imgURL = imgURL;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}
