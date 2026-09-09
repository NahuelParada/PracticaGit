package Clases;

import Enums.Hambre;
import Enums.Higene;
import Enums.Salud;

public abstract class Animal {
    private String nombre;
    private String especie;
    private Hambre hambre;
    private Salud salud;
    private Higene higene;

    public Animal(String nombre, String especie, Hambre hambre, Salud salud, Higene higene) {
        this.nombre = nombre;
        this.especie = especie;
        this.hambre = hambre;
        this.salud = salud;
        this.higene = higene;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public Hambre getHambre() {
        return hambre;
    }

    public Salud getSalud() {
        return salud;
    }

    public Higene getHigene() {
        return higene;
    }

    public void setHambre(Hambre hambre) {
        this.hambre = hambre;
    }

    public void setSalud(Salud salud) {
        this.salud = salud;
    }

    public void setHigene(Higene higene) {
        this.higene = higene;
    }

    public String comer(){
        if(this.hambre.equals(Hambre.HAMBRIENTO)){
            setHambre(Hambre.LLENO);
            return "El animal esta comiendo";
        }
        return "El animal esta lleno, no puede comer ";
    }

    public String enfermarse(){
        setSalud(Salud.ENFERMO);
        return "El animal esta enfermo";
    }

    public String ensuciarse(){
        if(this.higene.equals(Higene.LIMPIO)){
            setHigene(Higene.SUCIO);
            return "El animal se ensucio";
        }
        return "El animal ya esta sucio";
    }
}
