package com.example.petdaycare;

public class Animal {
    String nombre;
    String raza;
    String genero;
    double peso;

    public Animal (String nombre_animal, String raza_animal) {
        this.nombre = nombre_animal;
        this.raza= raza_animal;
    }

    public Animal(String nombre_animal, String raza_animal, String genero, double peso) {
        this.nombre = nombre_animal;
        this.raza= raza_animal;
        this.genero = genero;
        this.peso = peso;
    }

    public String getNombre_animal() {

        return nombre;
    }

    public double getPeso() {

        return peso;
    }

    public void setPeso(double peso) {

        this.peso = peso;
    }

    public String getGenero() {

        return genero;
    }

    public void setGenero(String genero) {

        this.genero = genero;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getRaza() {

        return raza;
    }

    public void setRaza_animal(String raza) {
        this.raza = raza;
    }
}
