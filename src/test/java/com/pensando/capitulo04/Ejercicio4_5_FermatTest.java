package com.pensando.capitulo04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio4_5_FermatTest {

    @Test
    public void testPotencia() {
        Ejercicio4_5_Fermat ejercicio = new Ejercicio4_5_Fermat();
        // Verificar que el ayudante funcione: 2^3 = 8
        assertEquals(8, ejercicio.elevarAPotencia(2, 3));
    }

    @Test
    public void testFermat() {
        Ejercicio4_5_Fermat ejercicio = new Ejercicio4_5_Fermat();

        // Caso 1: Fermat tiene razón (el teorema se cumple, la igualdad NO se cumple)
        // Probamos con 3, 4, 5 y n=3 (sabemos que 3^3 + 4^3 != 5^3)
        // 27 + 64 != 125 -> 91 != 125
        String resultado = ejercicio.chequearFermat(3, 4, 5, 3);
        assertEquals("No, eso no funciona.", resultado);

        // Caso 2: Pitágoras funciona con n=2 (3^2 + 4^2 = 5^2 -> 9+16=25)
        // Pero el teorema de Fermat dice n > 2. Si n=2, la condición (n>2) es falsa.
        // El libro dice "excepto en el caso n=2".
        // Si tu lógica es estricta (n > 2 && igualdad), para n=2 retornará "No, eso no funciona"
        // o dependerá de cómo implementes el IF.

        // Vamos a probar un caso hipotético donde Fermat se equivoque
        // (matemáticamente imposible con enteros, pero para probar tu IF):
        // Si forzamos a,b,c,n tal que coincidan, debería salir el mensaje de "Recórcholis".
        // Como no podemos romper la matemática, confiamos en que tu lógica de IF esté bien hecha.
    }
}