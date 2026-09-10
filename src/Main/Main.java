package Main;

import Clases.*;
import Enums.*;

public class Main {

    public static void main(String[] args) {

        Mamifero perro = new Mamifero(
                "Firulais",
                "Perro",
                Hambre.HAMBRIENTO,
                Salud.SANO,
                Higene.LIMPIO,
                Pelaje.CORTO
        );

        Mamifero leon = new Mamifero(
                "Simba",
                "Leon",
                Hambre.HAMBRIENTO,
                Salud.ENFERMO,
                Higene.SUCIO,
                Pelaje.CORTO
        );

        Ave loro = new Ave(
                "Pepe",
                "Loro",
                Hambre.HAMBRIENTO,
                Salud.SANO,
                Higene.SUCIO,
                "Bueno",
                CapacidadDeVuelo.HUESOS_NEUMATICOS
        );

        Reptil serpiente = new Reptil(
                "Kaa",
                "Serpiente",
                Hambre.LLENO,
                Salud.ENFERMO,
                Higene.SUCIO,
                true,
                false
        );

        Animal[] animales = {
                perro,
                leon,
                loro,
                serpiente
        };

        Cuidador juan = new Cuidador(
                "Juan",
                40123456,
                1001,
                500000,
                Especialidad.MAMIFERO
        );

        Cuidador pedro = new Cuidador(
                "Pedro",
                40234567,
                1002,
                500000,
                Especialidad.AVE
        );

        Cuidador carlos = new Cuidador(
                "Carlos",
                40345678,
                1003,
                500000,
                Especialidad.REPTIL
        );

        Cuidador[] cuidadores = {
                juan,
                pedro,
                carlos
        };

        System.out.println("========== CUIDADORES ==========");

        for (Cuidador cuidador : cuidadores) {
            System.out.println(cuidador.imprimirCuidador());
        }

        System.out.println("========== ANIMALES ==========");

        for (Animal animal : animales) {
            System.out.println(
                    animal.getNombre() + " - " +
                            animal.getEspecie() + " - " +
                            animal.getHambre() + " - " +
                            animal.getSalud() + " - " +
                            animal.getHigene()
            );
        }

        System.out.println("\n========== ALIMENTACION ==========");

        System.out.println(
                "Juan intenta alimentar a Firulais:"
        );

        System.out.println(
                juan.alimentar(perro)
        );

        System.out.println("\n========== LIMPIEZA ==========");

        System.out.println(
                "Juan intenta limpiar a Firulais:"
        );

        System.out.println(
                juan.limpiar(perro)
        );

        System.out.println("\n========== VACUNACION ==========");

        System.out.println(
                "Juan intenta vacunar a Simba:"
        );

        System.out.println(
                juan.vacunar(leon)
        );

        System.out.println(
                "\n========== PRUEBA DE ESPECIALIDAD =========="
        );

        System.out.println(
                "Juan (MAMIFERO) intenta alimentar a Pepe (AVE):"
        );

        System.out.println(
                juan.alimentar(loro)
        );

        System.out.println(
                "\nPedro (AVE) intenta limpiar a Kaa (REPTIL):"
        );

        System.out.println(
                pedro.limpiar(serpiente)
        );

        System.out.println(
                "\nCarlos (REPTIL) intenta vacunar a Kaa:"
        );

        System.out.println(
                carlos.vacunar(serpiente)
        );

        System.out.println("\n========== ESTADOS ==========");

        System.out.println("Firulais se ensucia:");
        System.out.println(perro.ensuciarse());

        System.out.println("Firulais se enferma:");
        System.out.println(perro.enfermarse());

        System.out.println("\n========== SONIDOS ==========");

        for (Animal animal : animales) {
            System.out.println(
                    animal.getNombre() + ": " +
                            animal.hacerSonido()
            );
        }
    }
}
