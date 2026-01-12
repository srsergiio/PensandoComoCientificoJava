package com.pensando.capitulo16;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProblemaJosefoTest {

    ProblemaJosefo josefo = new ProblemaJosefo();

    @Test
    public void testSobreviviente() {
        // Caso clásico: 5 personas, salto 2.
        // Cola inicial: [1, 2, 3, 4, 5]
        // 1. Paso 1 (k=2): El 1 pasa atrás. Cola: [2, 3, 4, 5, 1]. El 2 muere.
        // 2. Cola: [3, 4, 5, 1]. El 3 pasa. El 4 muere.
        // 3. Cola: [5, 1, 3]. El 5 pasa. El 1 muere.
        // 4. Cola: [3, 5]. El 3 pasa. El 5 muere.
        // 5. Sobrevive el 3.
        assertEquals(3, josefo.sobreviviente(5, 2));

        // Caso: 7 personas, salto 3
        // El sobreviviente matemático debería ser el 4.
        assertEquals(4, josefo.sobreviviente(7, 3));
    }
}