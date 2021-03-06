package org.cfm.solitario.models;

import org.cfm.solitario.enums.Palos;

import java.util.Stack;

public class Carta {

    private Palos palo;
    private int numeroCarta;

    public Carta() {
    }

    public Carta(Palos palo, int numeroCarta) {
        this.palo = palo;
        this.numeroCarta = numeroCarta;
    }

    public int getNumeroCarta() {
        return numeroCarta;
    }

    public Palos getPalo() {
        return palo;
    }

    public Stack<Carta> seleccionarMonton(Mesa mesa, int fila, int columna) {
        if (fila == 4) {
            Stack<Carta>[] cartas = mesa.getMontonExterior();
            return cartas[columna];
        } else {
            Stack<Carta>[][] cartas = mesa.getMontonInterior();
            return cartas[fila][columna];
        }
    }

    @Override
    public String toString() {
        return palo + " " + numeroCarta;
    }
}
