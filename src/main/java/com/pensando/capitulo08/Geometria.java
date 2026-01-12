package com.pensando.capitulo08;

import java.awt.Point;
import java.awt.Rectangle;

/**
 * Ejercicios del Capítulo 8: Objetos interesantes (Point y Rectangle).
 */
public class Geometria {

    /**
     * Ejercicio 8.2: Calcular distancia entre dos objetos Point.
     * Fórmula: raiz((x2-x1)^2 + (y2-y1)^2)
     * * @param p1 Primer punto.
     * @param p2 Segundo punto.
     * @return La distancia euclidiana entre ellos.
     */
    public double distancia(Point p1, Point p2) {
        // TODO:
        // 1. Calcular dx = p2.x - p1.x
        // 2. Calcular dy = p2.y - p1.y
        // 3. Retornar Math.sqrt(dx*dx + dy*dy)
        return 0.0;
    }

    /**
     * Ejercicio 8.2 (Continuación): Buscar el centro de un Rectángulo.
     * * @param caja El rectángulo a analizar.
     * @return Un nuevo objeto Point con las coordenadas del centro.
     */
    public Point buscarCentro(Rectangle caja) {
        // TODO:
        // 1. Calcular x = caja.x + caja.width / 2
        // 2. Calcular y = caja.y + caja.height / 2
        // 3. Retornar un new Point(x, y)
        return null;
    }

    /**
     * Ejercicio 8.3: Mutabilidad con 'grow'.
     * Este método debe modificar el rectángulo recibido agrandándolo.
     * * @param caja El rectángulo a modificar.
     * @param h Cantidad a agrandar horizontalmente.
     * @param v Cantidad a agrandar verticalmente.
     */
    public void agrandarRectangulo(Rectangle caja, int h, int v) {
        // TODO: Llamar al método .grow(h, v) del objeto caja.
        // Nota: Este método es void porque modifica el objeto 'in-place'.
    }
}