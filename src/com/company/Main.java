package com.company;

    /*Primera parte:

            Crear una función con tres parámetros que sean números que se suman entre sí.
            Llamar a la función en el main y darle valores.

        Segunda parte:

            Crear una clase coche.
            Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
            Una función que incremente el número de puertas que tiene el coche.
            Crear un objeto miCoche en el main y añadirle una puerta.
            Mostrar el número de puertas que tiene el objeto.*/

public class Main {

    public static void main(String[] args) {

        System.out.println("La suma es: "+ suma(3,5,8));

        coche miCoche = new coche();
        miCoche.quitarPuerta();
        miCoche.quitarPuerta();
        System.out.println("Quedaron: "+ miCoche.numero +" puertas");

        miCoche.adicionarPuerta();
        miCoche.adicionarPuerta();
        miCoche.adicionarPuerta();
        miCoche.adicionarPuerta();
        System.out.println("Quedaron: "+ miCoche.numero +" puertas");


    }

    public static int suma (int a, int b , int c){
        return(a+b+c);
    }
}

class coche {

    public int numero = 4;

    public void quitarPuerta(){
        this.numero--;
    }
    public void adicionarPuerta(){
        this.numero++;
    }
}