package Clases;

import Enums.Especialidad;
import Enums.Higene;
import Enums.Salud;

public class Cuidador extends Persona{
    private Especialidad especialidad;

    public Cuidador(String nombre, int dni, int legaje, int salario, Especialidad especialidad) {
        super(nombre, dni, legaje, salario);
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String alimentar(Animal animal){
        if(puedeCuidar(animal)){
            animal.comer();
            return getNombre()+" alimentó a "+ animal.getNombre();
        }else {
            return "El cuidador no puede alimentar a este animal";
        }
    }


    public String vacunar(Animal animal){
        if (!puedeCuidar(animal)) {
            return "El cuidador no puede vacunar este animal.";
        }
        if (animal.getSalud().equals(Salud.SANO)) {
            return "El animal está sano, no necesita vacunación.";
        }
        animal.setSalud(Salud.SANO);

        return "El cuidador vacunó a " + animal.getNombre();
    }


    public String limpiar(Animal animal) {

        if (!puedeCuidar(animal)) {
            return "El cuidador no puede limpiar este animal.";
        }
        if (animal.getHigene().equals(Higene.LIMPIO)) {
            return "El animal ya está limpio.";
        }
        animal.setHigene(Higene.LIMPIO);

        return "El cuidador limpió a " + animal.getNombre();
    }

    public boolean puedeCuidar(Animal animal){

        if(animal instanceof Mamifero && especialidad == Especialidad.MAMIFERO){
            return true;
        }

        if(animal instanceof Reptil && especialidad == Especialidad.REPTIL){
            return true;
        }

        if(animal instanceof Ave && especialidad == Especialidad.AVE){
            return true;
        }

        return false;
    }

    public String imprimirCuidador(){
        return  "Nombre       : " + getNombre() + "\n" +
                "DNI          : " + getDni() + "\n" +
                "Legajo       : " + getLegaje() + "\n" +
                "Salario      : $" + getSalario() + "\n" +
                "Especialidad : " + especialidad + "\n";
    }

}

