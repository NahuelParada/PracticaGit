package Clases;

import Enums.CapacidadDeVuelo;
import Enums.Hambre;
import Enums.Higene;
import Enums.Salud;

public class Ave extends Animal{

    private String estadoPelaje;
    private CapacidadDeVuelo capacidadDeVuelo;

    public Ave(String nombre, String especie, Hambre hambre, Salud salud, Higene higene, String estadoPelaje, CapacidadDeVuelo capacidadDeVuelo) {
        super(nombre, especie, hambre, salud, higene);
        this.estadoPelaje = estadoPelaje;
        this.capacidadDeVuelo = capacidadDeVuelo;
    }

    @Override
    public String hacerSonido() {
        return "pio pio";
    }
}
