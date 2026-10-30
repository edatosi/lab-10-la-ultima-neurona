package co.umariana.equipo;

import java.util.ArrayList;
import java.util.List;

/**
 * LA TARJETA DE CADA INTEGRANTE SE AGREGA EN ESTE ARCHIVO (el mismo para todo el equipo).
 *
 * Agregue UNA línea con su tarjeta, justo debajo del comentario ">>> AGREGUE ...".
 * Los datos son: su usuario de GitHub, su nombre, un mensaje corto (máximo 80 caracteres)
 * y un color (por ejemplo #EF476F, #118AB2, #06D6A0, #FFD166).
 *
 * Si dos compañeros agregan su línea en el mismo lugar, Git avisará de un conflicto al unir
 * los Pull Requests: cómo resolverlo se explica en clase.
 */
public final class Integrantes {

    /** Título que muestra la ventana (no es necesario cambiarlos). */
    public static final String NOMBRE_EQUIPO = "Nuestro equipo";
    public static final String LEMA = "Una tarjeta por integrante";

    private Integrantes() {
    }

    public static List<Tarjeta> tarjetas() {
        List<Tarjeta> lista = new ArrayList<>();

        lista.add(new Tarjeta("F-Hoyos", "Felipe Hoyos", "Gana atraves de tus acciones, nunca por medio de argumentos", "#BF260A"));
        lista.add(new Tarjeta("luihidalgo125-stack", "Luis Hidalgo", "Cree que puedes y ya habras recorrido la mitad del camino", "#bf0a8f"));
        lista.add(new Tarjeta("marcarvajal125-lgtm", "Mario Carvajal", "Todo lo que haces con es fuerso vale la pena", "#3eb7c7"));
      // >>> AGREGUE SU TARJETA DEBAJO DE ESTA LÍNEA <<<

        return lista;
    }
}
