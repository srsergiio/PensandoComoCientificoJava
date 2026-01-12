package com.pensando.capitulo11;

/**
 * Ejercicio Capítulo 11: Objetos Carta.
 * Representa una carta de póker estándar.
 */
public class Carta {

    // Mapeo para imprimir nombres bonitos en lugar de números
    // static final significa que es una constante compartida por todas las cartas
    public static final String[] PALOS = { "Tréboles", "Diamantes", "Corazones", "Picas" };
    public static final String[] VALORES = {
            null, "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jota", "Reina", "Rey"
    };

    // Atributos numéricos para eficiencia
    private int palo;  // 0, 1, 2, 3
    private int valor; // 1=As, 11=Jota, 12=Reina, 13=Rey

    public Carta(int palo, int valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public int getPalo() { return palo; }
    public int getValor() { return valor; }

    /**
     * Devuelve la descripción textual de la carta.
     * Ejemplo: "Jota de Diamantes"
     */
    public String toString() {
        // TODO: Usar los arreglos PALOS y VALORES con los índices this.palo y this.valor.
        // Formato: "Valor de Palo"
        return null;
    }

    /**
     * Compara si dos cartas son idénticas.
     */
    public boolean equals(Carta otra) {
        // TODO: Retornar true si palo y valor son iguales.
        return false;
    }

    /**
     * Compara cartas para ordenar (Ejercicio 11.3).
     * Devuelve 1 si this > otra, -1 si this < otra, 0 si iguales.
     * Orden: Primero por palo, luego por valor.
     * (Tréboles < Diamantes < Corazones < Picas)
     */
    public int compararCon(Carta otra) {
        // TODO:
        // 1. Si this.palo > otra.palo -> return 1
        // 2. Si this.palo < otra.palo -> return -1
        // 3. Si palos son iguales, comparar valores:
        //    a. Si this.valor > otra.valor -> return 1 (Ojo con el As si quisieras que sea el mayor, pero el libro lo trata como 1)
        //    b. Si this.valor < otra.valor -> return -1
        // 4. Son iguales -> return 0
        return 0;
    }
}