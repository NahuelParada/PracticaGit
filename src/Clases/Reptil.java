package Clases;

import Enums.Hambre;
import Enums.Higene;
import Enums.Salud;

public class Reptil extends Animal{

    private boolean esVenenoso;
    private boolean tienePatas;

    public Reptil(String nombre, String especie, Hambre hambre, Salud salud, Higene higene, boolean esVenenoso, boolean tienePatas) {
        super(nombre, especie, hambre, salud, higene);
        this.esVenenoso = esVenenoso;
        this.tienePatas = tienePatas;
    }

    @Override
    public String hacerSonido() {
        return "sssssss";
    }
}
