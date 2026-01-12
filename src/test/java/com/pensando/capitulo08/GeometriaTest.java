package com.pensando.capitulo08;

import org.junit.jupiter.api.Test;
import java.awt.Point;
import java.awt.Rectangle;
import static org.junit.jupiter.api.Assertions.*;

public class GeometriaTest {

    Geometria geo = new Geometria();

    @Test
    public void testDistancia() {
        // Distancia entre (0,0) y (3,4) es 5 (Triángulo 3-4-5)
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);

        assertEquals(5.0, geo.distancia(p1, p2), 0.0001, "La distancia debería ser 5.0");
    }

    @Test
    public void testBuscarCentro() {
        // Rectángulo en (0,0) con ancho 10 y alto 20. Centro debe ser (5, 10)
        Rectangle rect = new Rectangle(0, 0, 10, 20);
        Point centro = geo.buscarCentro(rect);

        assertNotNull(centro, "El centro no debe ser null");
        assertEquals(5, centro.x, "Coordenada X del centro incorrecta");
        assertEquals(10, centro.y, "Coordenada Y del centro incorrecta");
    }

    @Test
    public void testAgrandarRectangulo() {
        // Probamos que el objeto realmente cambia (es mutable)
        Rectangle rect = new Rectangle(0, 0, 10, 10);

        // Agrandamos 5 en cada dirección (suma 2*5 al ancho/alto)
        geo.agrandarRectangulo(rect, 5, 5);

        // Esperamos ancho 20 (10 + 5 + 5) y alto 20
        // Nota: grow() también cambia la posición (x,y), pero testeamos dimensiones aquí.
        assertEquals(20, rect.width, "El ancho debería haber aumentado");
        assertEquals(20, rect.height, "El alto debería haber aumentado");
    }
}