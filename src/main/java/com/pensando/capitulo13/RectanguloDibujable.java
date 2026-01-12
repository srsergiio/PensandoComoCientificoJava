package com.pensando.capitulo13;

import java.awt.Rectangle;
import java.awt.Color;

/**
 * Ejercicio de Herencia.
 * 'extends Rectangle' significa que esta clase TIENE todo lo que tiene Rectangle
 * (x, y, width, height) y ADEMÁS lo que le agreguemos (color).
 */
public class RectanguloDibujable extends Rectangle {

    private Color color;

    /**
     * Constructor que llama al constructor del padre (super).
     */
    public RectanguloDibujable(int x, int y, int ancho, int alto, Color color) {
        // 'super' llama al constructor de la clase padre (Rectangle)
        super(x, y, ancho, alto);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    /**
     * Método propio de esta clase hija.
     * Simula dibujar imprimiendo en consola.
     */
    public String dibujar() {
        // TODO: Retornar un texto describiendo el dibujo.
        // Ej: "Dibujando rectángulo en [x,y] de color [color]"
        // Puedes acceder a los campos heredados como 'this.x' o 'super.x'.
        return null;
    }
}