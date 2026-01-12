package com.pensando.capitulo13;

/**
 * Ejercicio Capítulo 13: Números Complejos.
 * Objetivo: Entender 'this', métodos de objeto y constructores.
 */
public class Complejo {

    // Atributos inmutables (buena práctica en objetos de valor matemático)
    private double real;
    private double imag;

    /**
     * Constructor.
     * @param real Parte real.
     * @param imag Parte imaginaria.
     */
    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Getters
    public double getReal() { return real; }
    public double getImag() { return imag; }

    /**
     * Devuelve una representación en String (ej: "3.0 + 4.0i").
     */
    public String toString() {
        // TODO: Retornar string concatenado.
        return null;
    }

    /**
     * Calcula el valor absoluto (módulo) del número complejo.
     * Fórmula: raiz(real^2 + imag^2)
     * * A diferencia de los capítulos anteriores, este método NO es static.
     * Accede a los datos usando 'this.real' o simplemente 'real'.
     */
    public double abs() {
        // TODO: Implementar la fórmula usando Math.sqrt.
        return 0.0;
    }

    /**
     * Compara si este número complejo es igual a otro.
     * @param otro El otro complejo a comparar.
     */
    public boolean equals(Complejo otro) {
        // TODO: Retornar true si las partes reales e imaginarias son iguales.
        return false;
    }

    /**
     * Suma este número complejo con otro y devuelve un NUEVO complejo.
     * (a + bi) + (c + di) = (a+c) + (b+d)i
     */
    public Complejo sumar(Complejo otro) {
        // TODO:
        // 1. Calcular nueva parte real: this.real + otro.real
        // 2. Calcular nueva parte imag: this.imag + otro.imag
        // 3. Retornar new Complejo(...) con los nuevos valores.
        return null;
    }
}