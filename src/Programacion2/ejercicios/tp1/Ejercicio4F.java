package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Cola;
import Programacion2.impl.ColaEstatica;

//Determinar si la Cola C1 es la inversa de la Cola C2.
public class Ejercicio4F {

    public static void main(String[] args) {
        Cola cola = new ColaEstatica();
        cola.inicializar();
        Cola cola1 = new ColaEstatica();
        cola.inicializar();
        Utils.fillQueue(cola, 7);
        System.out.println("Los valores de la cola C1 son: ");
        Utils.printStaticQueue(cola);
        System.out.println();
        Utils.fillQueue(cola1, 7);
        System.out.println("Los valores de la cola C2 son: ");
        Utils.printStaticQueue(cola1);


    }
}
