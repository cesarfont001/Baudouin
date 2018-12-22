/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Fontaine César
 */
class Carton {
    
    private int id;
    private String carton = "Carton";
    private double somme;

    public Carton(int id, String carton, double somme) {
        this.id = id;
        this.somme = somme;
        this.carton = carton;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarton() {
        return carton;
    }

    public void setCarton(String carton) {
        this.carton = carton;
    }

    public double getSomme() {
        return somme;
    }

    public void setSomme(double somme) {
        this.somme = somme;
    }
    
    
    
}
