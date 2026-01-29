package com.pensando.capitulo04;

/**
 * Ejercicio 4.3: Recursión.
 * Objetivo: Escribir un programa que "cante" la canción de las 99 botellas.
 * Usaremos recursión para generar las estrofas.
 */
public class Ejercicio4_3_Cerveza {

    /**
     * Devuelve la estrofa correspondiente al número de botellas.
     * * @param n Número de botellas.
     * @return La estrofa completa o el final de la canción si n es 0.
     */
    public String obtenerEstrofa(int n) {
        // TODO: Implementar la lógica con IF / ELSE.
        String Estrofa;
        if (n == 0) {
            System.out.println("No hay más botellas de cerveza en la pared," +
                    " no hay más botellas de cerveza, no las agarrarás, y no las pasarás," +
                    " porque no hay más botellas de cerveza en la pared.");

            return "No hay más botellas de cerveza en la pared," +
                    " no hay más botellas de cerveza, no las agarrarás, y no las pasarás," +
                    " porque no hay más botellas de cerveza en la pared.";

        }
        // Caso Base (n == 0):
        // Retornar: "No hay más botellas de cerveza en la pared, no hay más botellas de cerveza, no las agarrarás, y no las pasarás, porque no hay más botellas de cerveza en la pared."
        else {
            System.out.println("%d botellas de cerveza en la pared,".formatted(n) +
                    " %d botellas de cerveza, una sola agarrás,".formatted(n) +
                    " y después la pasás, %d botellas de cerveza en la pared.".formatted(n - 1));

            return "%d botellas de cerveza en la pared,".formatted(n) +
                    " %d botellas de cerveza, una sola agarrás,".formatted(n) +
                    " y después la pasás, %d botellas de cerveza en la pared.".formatted(n - 1)+ obtenerEstrofa( n-1);
        }


        // Caso Recursivo (n > 0):
        // Retornar: "n botellas de cerveza en la pared, n botellas de cerveza, una sola agarrás, y después la pasás, n-1 botellas de cerveza en la pared."
        // (Cuidado con el singular/plural si n=1, aunque el libro no lo exige estrictamente).


    }

    /**
     * Método recursivo principal que orquesta la canción.
     * En un caso real, esto imprimiría, pero aquí podemos usarlo para
     * entender el flujo llamando a obtenerEstrofa y luego a sí mismo.
     */
    public void cantarCancion(int n) {
        if (n < 0) {
            return;
        }
        // TODO:
        // 1. Obtener la estrofa actual: String estrofa = obtenerEstrofa(n);
        // 2. Hacer algo con ella (ej. imprimirla o guardarla).
        // 3. Llamada recursiva: cantarCancion(n - 1);
    }

    public static void main (String[] args){
        System.out.println("hola");

          Ejercicio4_3_Cerveza a = new Ejercicio4_3_Cerveza();
          a.obtenerEstrofa(3);
    }
}