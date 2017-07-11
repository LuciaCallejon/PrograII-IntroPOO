package Programacion2.impl;

import Programacion2.api.Cola;

public class ColaImpl implements Cola {

    int[] elementos;
    int index;

    public void acolar(int element) {
        elementos[index] = element;
        index++;
    }

    public void inicializar() {
        elementos = new int[100];
    }

    public void desacolar() {
        int toReturn = elementos[0];
        for (int i = 1; i < index; i++) {
            elementos[i-1] = elementos[i];
        }
        index--;
    }

    public boolean colaVacia() {
        return index == 0;
    }

    public int primero() {
        return elementos[0];
    }

    public int size() {
        return index;
    }


    public void print() {
        for (int i = 0; i < index; i++) {
            System.out.print(elementos[i] + " ");
        }
    }
}
