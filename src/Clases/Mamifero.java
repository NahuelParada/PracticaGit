package Clases;

import Enums.Hambre;
import Enums.Higene;
import Enums.Pelaje;
import Enums.Salud;

public class Mamifero extends Animal{

    private Pelaje tipoPelaje;

    public Mamifero(String nombre, String especie, Hambre hambre, Salud salud, Higene higene, Pelaje tipoPelaje) {
        super(nombre, especie, hambre, salud, higene);
        this.tipoPelaje = tipoPelaje;
    }

    @Override
    public String hacerSonido() {
        return "rawr";
    }
}
