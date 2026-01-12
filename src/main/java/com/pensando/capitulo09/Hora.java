package com.pensando.capitulo09;

/**
 * Ejercicio Capítulo 9: La clase Hora.
 * Representa una hora del día con precisión de segundos (double).
 */
public class Hora {

    // 1. Atributos (Variables de Instancia)
    // Se declaran 'private' para que nadie los modifique directamente desde fuera.
    private int hora;
    private int minuto;
    private double segundo;

    /**
     * Constructor por defecto.
     * Inicializa la hora en 00:00:00.0
     */
    public Hora() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0.0;
    }

    /**
     * Constructor con parámetros.
     * Permite crear una hora específica. Ej: new Hora(11, 30, 0.0);
     */
    public Hora(int hora, int minuto, double segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Getters (para poder leer los valores desde el test)
    public int getHora() { return hora; }
    public int getMinuto() { return minuto; }
    public double getSegundo() { return segundo; }

    /**
     * Reemplazo del método 'imprimirHora' del libro.
     * En Java profesional usamos 'toString()' para dar formato de texto al objeto.
     * @return String con formato "hora:minuto:segundo" (ej: "11:5:30.0")
     */
    public String toString() {
        // TODO: Retornar una cadena concatenando hora, ":", minuto, ":", segundo.
        // Pista: String.format("%02d:%02d:%04.1f", hora, minuto, segundo) queda más bonito,
        // pero la concatenación simple también sirve.
        return null;
    }

    /**
     * Ejercicio: Método equals.
     * Compara si esta Hora es igual a otra.
     * @param otra El otro objeto Hora a comparar.
     * @return true si hora, minuto y segundo son idénticos.
     */
    public boolean equals(Hora otra) {
        // TODO:
        // Retornar true SOLO SI (this.hora == otra.hora) Y (this.minuto == otra.minuto)...
        return false;
    }

    /**
     * Ejercicio Avanzado: Incrementar.
     * Suma una cantidad de segundos a la hora actual, ajustando minutos y horas si es necesario.
     * Ej: 10:59:59 + 1 segundo -> 11:00:00
     */
    public void incrementar(double segundosExtra) {
        // TODO:
        // 1. Sumar segundosExtra a this.segundo.
        // 2. Mientras (this.segundo >= 60.0):
        //    a. Restar 60.0 a this.segundo.
        //    b. Sumar 1 a this.minuto.
        // 3. Mientras (this.minuto >= 60):
        //    a. Restar 60 a this.minuto.
        //    b. Sumar 1 a this.hora.
    }
}