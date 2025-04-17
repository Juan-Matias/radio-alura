package com.aluracursos.radioalura.principal;
import com.aluracursos.radioalura.modelos.Audio;
import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.Podcast;
import com.aluracursos.radioalura.modelos.MisFavoritos;

public class Principal {
    public static void main(String[] args) {
        // Crear la Canción usando el Builder
        Cancion miCancion = new Cancion.Builder("Forever", "Kiss")
                .album("Forever Hits")
                .genero("Rock")
                .build();

        // Incrementar "me gusta" y reproducciones
        aumentarMeGustaYReproducciones(miCancion, 100, 2000);

        // Crear el Podcast usando el Builder
        Podcast miPodcast = new Podcast.Builder("Cafe.Tech", "Gabriela Aguiar")
                .descripcion("Tecnología explicada de forma simple")
                .build();

        // Incrementar "me gusta" y reproducciones
        aumentarMeGustaYReproducciones(miPodcast, 100, 8000);

        // Resultados
        System.out.println("\n🎵 Información de la Canción:");
        System.out.println(miCancion);

        System.out.println("\n🎧 Información del Podcast:");
        System.out.println(miPodcast);

        // Favoritos
        System.out.println("\n💖 Favoritos:");
        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adiciona(miPodcast);
        favoritos.adiciona(miCancion);
    }

    // Método para evitar duplicar código en me gusta y reproducciones
    private static void aumentarMeGustaYReproducciones(Audio audio, int meGusta, int reproducciones) {
        for (int i = 0; i < meGusta; i++) {
            audio.meGusta();
        }
        for (int i = 0; i < reproducciones; i++) {
            audio.reproduce();
        }
    }
}
