package Clases;

public abstract class Persona {

    private String nombre;
    private int dni;
    private int legajo;
    private int salario;

    public Persona(String nombre, int dni, int legaje, int salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.legajo = legaje;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getLegaje() {
        return legajo;
    }

    public void setLegaje(int legaje) {
        this.legajo = legaje;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
