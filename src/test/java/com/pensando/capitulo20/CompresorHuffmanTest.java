package com.pensando.capitulo20;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class CompresorHuffmanTest {

    @Test
    public void testHuffmanCompleto() {
        CompresorHuffman huffman = new CompresorHuffman();
        String textoOriginal = "banana";

        // 1. Construir Árbol
        NodoHuffman raiz = huffman.construirArbol(textoOriginal);
        assertNotNull(raiz, "El árbol no debe ser nulo");
        // En "banana": 'a':3, 'n':2, 'b':1. Total raiz: 6.
        assertEquals(6, raiz.frecuencia, "La frecuencia total en la raíz debe ser el largo del texto");

        // 2. Generar Códigos
        Map<Character, String> codigos = huffman.generarCodigos(raiz);

        // 'a' es la más frecuente, debería tener el código más corto (probablemente longitud 1, ej: "0" o "1")
        // 'b' es la menos frecuente, código más largo (longitud 2 o 3)
        assertTrue(codigos.containsKey('a'));
        assertTrue(codigos.get('a').length() < codigos.get('b').length(),
                "La letra más frecuente 'a' debe tener un código más corto o igual que la menos frecuente");

        // 3. Codificar
        String binario = huffman.codificar(textoOriginal, codigos);
        System.out.println("Texto original: " + textoOriginal);
        System.out.println("Codificado: " + binario);

        // 4. Decodificar
        String decodificado = huffman.decodificar(binario, raiz);
        assertEquals(textoOriginal, decodificado, "El texto decodificado debe ser IDÉNTICO al original");
    }
}