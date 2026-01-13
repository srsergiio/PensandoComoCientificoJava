package com.pensando.capitulo02;

/**
 * Ejercicio 2.2 del libro.
 * Objetivo: Calcular segundos y porcentajes del día.
 */
public class Ejercicio2_2_Hora {

    // TODO: Declarar variables para hora, minuto y segundo (int)
    int hora, minuto, segundo;

    public Ejercicio2_2_Hora(int hora, int minuto, int segundo) {
        // TODO: Inicializar las variables con los valores de los parámetros
        this.hora=hora;
        this.minuto=minuto;
        this.segundo=segundo;
    }

    /**
     * Actividad c: Calcular número de segundos desde la medianoche.
     * Ayuda: (hora * 3600) + ...
     */
    public int calcularSegundosDesdeMedianoche() {
        // TODO: Implementar la fórmula matemática

        return (this.hora*3600)+(this.minuto*60)+this.segundo;
    }

    /**
     * Actividad d: Calcular número de segundos que quedan en el día.
     * Ayuda: Un día tiene 86400 segundos.
     */
    public int calcularSegundosRestantes() {
        // TODO: Calcular total del día menos los segundos pasados
        return 86400-(this.hora*3600)-(this.minuto*60)-this.segundo;
    }

    /**
     * Actividad e: Calcular porcentaje del día que ha pasado.
     * Ayuda: (segundosPasados * 100) / totalSegundosDia
     * CUIDADO: Recuerda usar decimales (86400.0) para evitar división entera.
     */
    public double calcularPorcentajeDelDia() {
        // TODO: Calcular el porcentaje
        return   ((((double)this.hora*3600)+((double)this.minuto*60)+(double)this.segundo)*100/86400);
    }
}