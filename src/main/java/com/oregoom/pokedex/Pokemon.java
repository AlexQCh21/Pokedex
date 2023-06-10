package com.oregoom.pokedex;

public class Pokemon {
    
    private String name;
    private String weight;
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public String getPeso() {
        return weight;
    }

    public void set(String tipo) {
        this.weight = tipo;
    }
}
