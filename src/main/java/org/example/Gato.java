package org.example;

public class Gato extends Felino{

    double peso = 3.00;

    void imprimirPeso(){
        System.out.println("PEso: " + super.peso);
    }

    void correr(){
        System.out.println("Gato corriendo");
    }
    void correrFelino(){
        super.correr();
    }

}
